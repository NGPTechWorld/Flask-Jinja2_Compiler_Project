from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

articles = [
    {
        "code": 11,
        "title": "Compilers are not magic",
        "author": "Aya",
        "views": 320,
        "body": "A compiler is a program that reads one language and writes another."
    },
    {
        "code": 12,
        "title": "Why static generation wins",
        "author": "Kareem",
        "views": 145,
        "body": "Rendering at build time removes the server from the critical path."
    }
]

last_code = 12


@app.route('/')
def home():
    return render_template('home.html', articles=articles)


@app.route('/article/<int:article_code>')
def article_page(article_code):
    article = None
    for a in articles:
        if a['code'] == article_code:
            article = a
            break

    if article is None:
        return redirect(url_for('home'))

    return render_template('article.html', article=article)


@app.route('/about')
def about():
    return render_template('about.html')


if __name__ == '__main__':
    app.run(debug=True)
