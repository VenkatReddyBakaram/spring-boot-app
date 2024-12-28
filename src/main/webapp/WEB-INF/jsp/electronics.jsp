<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Electronics - Online Shop</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }
        header {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 20px;
        }
        header h1 {
            margin: 0;
            font-size: 36px;
        }
        .container {
            display: flex;
            justify-content: space-around;
            margin: 40px 0;
        }
        .category {
            width: 45%;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        .category h2 {
            text-align: center;
            color: #333;
        }
        .product-list {
            list-style-type: none;
            padding: 0;
        }
        .product-item {
            margin: 20px 0;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .product-item img {
            width: 100px;
            height: 100px;
            object-fit: cover;
            border-radius: 8px;
        }
        .product-item button {
            background-color: #3498db;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .product-item button:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>

    <header>
        <h1>Electronics - Online Shop</h1>
        <p>Choose from our latest electronics</p>
    </header>

    <div class="container">
        <div class="category">
            <h2>Electronics</h2>
            <ul class="product-list">
                <li class="product-item">
                    <img src="https://via.placeholder.com/100" alt="Smartphone">
                    <span>Smartphone</span>
                    <button>Buy Now</button>
                </li>
                <li class="product-item">
                    <img src="https://via.placeholder.com/100" alt="Laptop">
                    <span>Laptop</span>
                    <button>Buy Now</button>
                </li>
                <li class="product-item">
                    <img src="https://via.placeholder.com/100" alt="Headphones">
                    <span>Headphones</span>
                    <button>Buy Now</button>
                </li>
            </ul>
            <h2> Welcome to Mr . ${email} </h2>
            <a href="./payment">Payment</a> | <a href="./furniture">Furniture</a>
        </div>
    </div>

</body>
</html>
