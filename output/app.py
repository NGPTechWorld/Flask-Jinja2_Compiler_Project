from flask import Flask, render_template, request, redirect, url_for, jsonify
from werkzeug.utils import secure_filename
import os
app = Flask(__name__)


products = [
    {
        "id": 1,
        "name": "Dell XPS 15 Laptop",
        "price": 450,
        "image": "static/images/image1.jpg",
        "description": "High-performance laptop with a crystal-clear display and powerful processor, perfect for creative tasks and work."
    },
    {
        "id": 2,
        "name": "iPhone 15 Pro",
        "price": 520,
        "image": "static/images/image2.jpg",
        "description": "The latest Apple phone with a professional camera, titanium design, and unmatched performance."
    },
    {
        "id": 3,
        "name": "Sony WH-1000XM5 Headphones",
        "price": 120,
        "image": "static/images/image3.jpg",
        "description": "Wireless headphones offering exceptional noise cancellation and superior sound quality for an immersive listening experience."
    }
]

last_id = 1

@app.route('/')
def index():
    return render_template('products.html', products=products)


@app.route('/add-product', methods=['GET', 'POST'])
def add_product():
    global last_id
    if request.method == 'POST':
        name = request.form['name']
        price = float(request.form['price'])
        description = request.form['description']
        image_file = request.files.get('image')

        if image_file:
            filename = secure_filename(image_file.filename)
            save_path = os.path.join('static', 'images', filename)
            image_file.save(save_path)
            image = f"/static/images/{filename}"
        else:
            image = '/static/images/default.jpg'  
        last_id += 1
        new_product = {"id": last_id,"name": name,"price": price,"image": image,"description": description}
        products.append(new_product)
        return redirect(url_for('index'))
    return render_template('add_product.html')


@app.route('/product/<int:product_id>')
def product_details(product_id):
    product = None
    for p in products:
        if p['id'] == product_id:
            product = p
            break
    
    if product is None:
        return redirect(url_for('index'))
        
    return render_template('product_details.html', product=product)


@app.route('/delete-product/<int:product_id>', methods=['POST', 'DELETE'])
def delete_product(product_id):
   
    global products
    product_to_delete = None
    for p in products:
        if p['id'] == product_id:
            product_to_delete = p
            break
    
    if product_to_delete:
        products.remove(product_to_delete) 
        return redirect(url_for('index'))
    else:
        return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True)
    
