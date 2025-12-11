from flask import Flask, render_template, request, redirect, url_for, jsonify

app = Flask(__name__)


products = [{"id": 1,"name": "لابتوب Dell XPS 15","price": 450,"image": "/static/images/image1.jpg","description": "لابتوب عالي الأداء بشاشة كريستالية واضحة ومعالج قوي، مثالي للمهام الإبداعية والعمل."},{"id": 2,"name": "هاتف iPhone 15 Pro","price": 520,"image": "/static/images/image2.jpg","description": "أحدث هاتف من آبل بكاميرا احترافية وتصميم من التيتانيوم وأداء لا مثيل له."},{"id": 3,"name": "سماعات Sony WH-1000XM5","price": 120,"image": "/static/images/image3.jpg","description": "سماعات لاسلكية تقدم إلغاء ضوضاء استثنائي وجودة صوت فائقة لتجربة استماع غامرة."}]

last_id = 3

# === المسارات (Routes) ===

@app.route('/')
def index():
    """
    هذه الدالة مسؤولة عن عرض الصفحة الرئيسية التي تحتوي على قائمة جميع المنتجات.
    """
    return render_template('products.html', products=products)
from werkzeug.utils import secure_filename
import os

@app.route('/add-product', methods=['GET', 'POST'])
def add_product():
    global last_id

    if request.method == 'POST':
        name = request.form['name']
        price = float(request.form['price'])
        description = request.form['description']

        # === رفع الصورة ===
        image_file = request.files.get('image')

        if image_file:
            # تنظيف اسم الملف (مهم جداً)
            filename = secure_filename(image_file.filename)

            # تحديد المسار الكامل لحفظ الصورة
            save_path = os.path.join('static', 'images', filename)

            # حفظ الصورة داخل المجلد
            image_file.save(save_path)

            # رابط الصورة لعرضها في واجهة المستخدم
            image = f'/static/images/{filename}'
        else:
            image = '/static/images/default.jpg'  # صورة افتراضية لو ما رفع شي

        # إنشاء ID جديد
        last_id += 1

        # إنشاء المنتج الجديد
        new_product = {"id": last_id,"name": name,"price": price,"image": image,"description": description}

        products.append(new_product)

        return redirect(url_for('index'))

    return render_template('add_product.html')

# مسار عرض تفاصيل منتج محدد
@app.route('/product/<int:product_id>')
def product_details(product_id):
    """
    تبحث عن منتج باستخدام الـ ID وتعرض صفحة التفاصيل الخاصة به.
    """
    # البحث عن المنتج في القائمة
    product = next((p for p in products if p['id'] == product_id), None)
    
    # إذا لم يتم العثور على المنتج، أعد التوجيه للصفحة الرئيسية
    if product is None:
        return redirect(url_for('index'))
        
    return render_template('product_details.html', product=product)

# مسار حذف منتج (يدعم طريقتي POST و DELETE)
@app.route('/delete-product/<int:product_id>', methods=['POST', 'DELETE'])
def delete_product(product_id):
    """
    تحذف منتجًا من القائمة بناءً على الـ ID.
    """
    global products
    # البحث عن المنتج وحذفه
    product_to_delete = next((p for p in products if p['id'] == product_id), None)
    
    if product_to_delete:
        products.remove(product_to_delete)
        # إرجاع استجابة JSON بنجاح العملية (مفيد لـ JavaScript)
        return redirect(url_for('index'))
    else:
        # إرجاع خطأ 404 إذا لم يتم العثور على المنتج
        return redirect(url_for('index'))

# تشغيل التطبيق
if __name__ == '__main__':
    # debug=True يسمح بتحديث التغييرات تلقائيًا وعرض الأخطاء
    app.run(debug=True)