# مترجم Flask + Jinja2 → موقع ثابت

مشروع المترجمات — يأخذ مشروع Flask كاملاً (`app.py` + `templates/` + `static/`)
ويُخرج موقع HTML ثابتاً جاهزاً للتصفّح، بلا سيرفر.

بمعنى آخر: ننفّذ عمل `render_template()` **وقت الترجمة** بدل وقت التشغيل.

```
app.py + templates/  ─►  المترجم  ─►  output/*.html + compiler_output/
```

---

## التشغيل السريع

```powershell
# 1) البناء
$javaFiles = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -cp ".\lib\antlr-4.13.2-complete.jar;." -d out $javaFiles

# 2) التشغيل
java -cp ".\lib\antlr-4.13.2-complete.jar;out" MainTest
```

ثم افتح `output/products.html` في المتصفح.

### أوضاع التشغيل

| الأمر | ماذا يفعل |
|---|---|
| `MainTest` | توليد مرة واحدة |
| `MainTest <path/to/app.py>` | توليد مشروع آخر |
| `MainTest --watch` | يراقب الملفات ويعيد التوليد عند أي حفظ |
| `MainTest --serve [port]` | يخدم الخرج على `localhost:8080` وتعمل نماذج الإضافة والحذف |

> في وضع `--serve` افتح `http://localhost:8080` — **لا** تفتح الملف بدبل كليك، لأن مسارات النماذج المطلقة لا تُحلّ عبر `file://`.

---

## المتطلبات

* **JDK 17** أو أحدث (المشروع يستعمل records و pattern matching)
* `lib/antlr-4.13.2-complete.jar` — مرفق في المستودع
* لا مكتبات خارجية أخرى: سيرفر المعاينة مبني على `com.sun.net.httpserver` من الـ JDK

---

## بنية المشروع

```
Compiler1Project/
├── lib/
│   ├── antlr-4.13.2-complete.jar
│   └── build_run.ps1                    سكربت بناء وتشغيل
│
├── src/
│   ├── MainTest.java                    ⭐ السائق: يربط المراحل الست
│   │
│   ├── antlr/                           القواعد والملفات المولّدة (14 ملف)
│   │   ├── python_flask/
│   │   │   ├── PythonLexer.g4           توكنات Python + INDENT/DEDENT
│   │   │   ├── PythonParser.g4          قواعد Python
│   │   │   └── generated/               ناتج ANTLR
│   │   └── html_css_jinja2/
│   │       ├── HtmlCssJinja2Lexer.g4    توكنات + 5 أنماط (TAG/ATTVALUE/CSS/JINJA2_*)
│   │       ├── HtmlCssJinja2Parser.g4   قواعد HTML و CSS و Jinja
│   │       └── generated/
│   │
│   ├── ast/                             عقد الشجرة (148 صنفاً)
│   │   ├── BaseNode.java                الأب المشترك: name + line
│   │   ├── python_flask/                59 صنفاً
│   │   │   ├── compound_statement/      if / for / while / def / class
│   │   │   ├── simple_statement/        return / break / continue / assignment
│   │   │   └── expressions_roles/       التعابير والعوامل والقيم الحرفية
│   │   └── html_css_jinja2/             88 صنفاً
│   │       ├── htmlElements/            العناصر والسمات والنصوص
│   │       ├── jinjaBlock/              {{ }} و {% %} والتعليقات
│   │       └── css/                     قواعد CSS والتصريحات
│   │
│   ├── visitor/                         بناء الشجرة من Parse Tree
│   │   ├── python_flask/ASTBuilderVisitor.java
│   │   ├── python_flask/ASTPrinter.java
│   │   ├── html_css_jinja2/ASTBuilderVisitor2.java
│   │   └── html_css_jinja2/ASTPrinter2.java
│   │
│   ├── Symbol_table/                    جدول الرموز (للتحليل الدلالي فقط)
│   │   ├── Symbol.java                  اسم + نوع + سطر
│   │   ├── Scope.java                   نطاق واحد
│   │   └── SymbolTable.java             مكدّس نطاقات
│   │
│   ├── semantic/                        التحليل الدلالي
│   │   ├── SemanticError.java           ERROR / WARNING موحّد للجانبين
│   │   ├── python_flask/SemanticAnalyzer.java
│   │   └── html_css_jinja2/SemanticAnalyzer.java
│   │
│   ├── generator/                       ⭐ مرحلة التوليد
│   │   ├── runtime/
│   │   │   ├── Scope.java               بيئة القيم (ليست جدول الرموز)
│   │   │   └── PythonContextGenerator.java   مُقيِّم + منفّذ + مُعدِّد مسارات
│   │   ├── JinjaEvaluator.java          تقييم تعابير Jinja
│   │   ├── HtmlGenerator.java           الشجرة → HTML
│   │   ├── RouteMap.java                مسارات Flask → ملفات مولّدة
│   │   ├── AstJsonWriter.java           أي شجرة → JSON بالانعكاس
│   │   ├── PreviewServer.java           سيرفر المعاينة (JDK فقط)
│   │   └── DataLinkExtractor.java       ربط أسماء السياق (المرحلة السابقة)
│   │
│   └── testing/
│       ├── my_store/                    مشروع الاختبار الأول: منتجات
│       │   ├── app.py
│       │   ├── templates/               products / add_product / product_details
│       │   └── static/                  CSS + صور + JS
│       └── my_blog/                     مشروع الاختبار الثاني: مقالات
│           ├── app.py                   كيان مختلف، حقل معرّف مختلف (code)
│           ├── templates/               home / article / about
│           └── static/
│
├── output/                              ✅ الموقع الناتج
├── compiler_output/                     ✅ تقارير مراحل الترجمة
│
├── README.md                            هذا الملف
└── INTERVIEW-GUIDE.md                   شرح المفاهيم للمناقشة
```

---

## مسار الترجمة — ست مراحل

```
[1] Python front-end    lex → parse → AST → symbols → semantic
[2] Python generation   حساب القيم، فتح المسارات → خطة التوليد
[3] Jinja front-end     تحليل كل قالب مرة واحدة → AST → semantic
[4] Jinja generation    ملف HTML لكل بند في الخطة
[5] Companion files     نسخ static/ و app.py بلا معالجة
[6] Compiler reports    compiler_output/
```

**لا شيء في المترجم مكتوب بالاسم:** الصفحات المولّدة هي بالضبط الصفحات التي يستطيع
`app.py` خدمتها، بناءً على البيانات التي يصرّح بها.

---

## المخرجات

### `output/` — الموقع الناتج

| الملف | المصدر |
|---|---|
| `products.html` | المسار `/` |
| `add_product.html` | المسار `/add-product` |
| `product_details.html` | المسار `/product/<int:product_id>` |
| `static/` | منسوخ كما هو |
| `app.py` | منسوخ كما هو، لا يدخل التحليل ولا التوليد |

### `compiler_output/` — تقارير المراحل

| الملف | المحتوى |
|---|---|
| `ast_python.json` | شجرة Python كاملة |
| `ast_jinja.json` | أشجار القوالب، مفتاح لكل قالب |
| `semantic_report.txt` | كل الأخطاء والتحذيرات من الجانبين |
| `generation_log.txt` | سجل التوليد: القيم، المسارات، توسيع الحلقات |
| `symbol_table.txt` | جداول الرموز: Python + HTML/CSS/Jinja لكل قالب |

---

## أبرز ما في المشروع

**فتح المسارات (Route Unrolling)**
في Flask تُنفَّذ `render_template` مرة لكل طلب. المترجم لا طلبات لديه، فيُعدّ كل
الطلبات الممكنة وقت الترجمة — نظير فتح الحلقات، لكن على مستوى الصفحات.

**منفّذ تعليمات Python مصغَّر**
لأن السياق قد يعتمد على متغيّر محلّي، يُنفَّذ جسم دالّة المسار فعلياً:
`if` و `for` و `while` و `break` و `continue` و `return`، مع سقف 10,000 دورة
لحلقة `while` حمايةً من التعليق.

**استنتاج فضاء وسائط الـ URL**
قيم `<int:product_id>` تُشتقّ من البيانات لا من جدول مكتوب، فيعمل المترجم على
`article_code` في مشروع المدوّنة دون أي تعديل.

**لا تُولَّد مخرجات من مصدر لم يُحلَّل**
إذا فشل تحليل ملف، يبقى الخرج السابق سليماً ويُطبع سبب التخطّي.

---

## اختبار العمومية

```powershell
java -cp ".\lib\antlr-4.13.2-complete.jar;out" MainTest src/testing/my_blog/app.py
```

مشروع مختلف كلياً — كيان `articles` بدل `products`، حقل معرّف `code` بدل `id`،
مسارات وقوالب مختلفة — ويعمل بلا تعديل سطر واحد في المترجم:

```
URL parameter : article_code <- articles [11, 12]
render plan   : 3 page(s)
```

---

## حدود معروفة

| # | النقطة | الأثر |
|---|---|---|
| 1 | المحلّل الدلالي لا يتبع `<link rel="stylesheet">` | تحذيرات `Class not defined` بعد فصل CSS |
| 2 | `visitJinja2StmtNotExpression` غير مفعّلة | `{% if not x %}` تُعامَل كـ `{% if x %}` |
| 3 | `PreviewServer` يعرف مسارَي المتجر حرفياً | أزرار الإضافة/الحذف لا تعمل على مشروع آخر |
| 4 | القواعد لا تدعم `try/except` | لا استيراد شرطي في `app.py` |
| 5 | توابع القوائم (`append`, `remove`) لا تُنفَّذ | التعديلات داخل دوال Python لا تنعكس |

التفاصيل وخطط الإصلاح في [INTERVIEW-GUIDE.md](INTERVIEW-GUIDE.md#12-نقاط-ضعف-معروفة--كن-صادقاً).

---

## إعادة توليد ملفات ANTLR

بعد أي تعديل على ملفات `.g4`:

```powershell
java -jar ./lib/antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -listener `
     -o ./src/antlr/python_flask/generated `
     ./src/antlr/python_flask/PythonParser.g4 ./src/antlr/python_flask/PythonLexer.g4

java -jar ./lib/antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -listener `
     -o ./src/antlr/html_css_jinja2/generated `
     ./src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 ./src/antlr/html_css_jinja2/HtmlCssJinja2Lexer.g4
```

أو من VS Code: **Terminal → Run Task** ثم اختر المهمة المناسبة.

---

## الفريق

| الاسم | الفئة |
|---|---|
| محمد علي حسن النعيمي | 12 |
| كريم رأفت البزرة | 12 |
| أسامة محمد سامر زرقاوي | 12 |
| نور الدين كساب خليل | 12 |
| محمد الحسن محمود زعيتر | 12 |
