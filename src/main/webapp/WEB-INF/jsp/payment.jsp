<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment - Online Shop</title>
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
            max-width: 600px;
            margin: 40px auto;
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .container h2 {
            text-align: center;
            color: #333;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            color: #333;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        .form-group input[type="radio"] {
            width: auto;
            margin-right: 10px;
        }
        .form-group select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        .btn-submit {
            background-color: #3498db;
            color: white;
            padding: 15px 25px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
            font-size: 18px;
            margin-top: 20px;
            transition: background-color 0.3s;
        }
        .btn-submit:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>

    <header>
        <h1>Payment - Online Shop</h1>
        <p>Complete your purchase</p>
    </header>

    <div class="container">
        <h2>Payment Information</h2>
        <form action="#" method="post">
            <!-- Name -->
            <div class="form-group">
                <label for="name">Full Name</label>
                <input type="text" id="name" name="name" required placeholder="Enter your full name">
            </div>
            
            <!-- Address -->
            <div class="form-group">
                <label for="address">Shipping Address</label>
                <input type="text" id="address" name="address" required placeholder="Enter your shipping address">
            </div>

            <!-- Card Information -->
            <div class="form-group">
                <label for="card-number">Card Number</label>
                <input type="text" id="card-number" name="card-number" required placeholder="Enter your card number">
            </div>

            <div class="form-group">
                <label for="expiry-date">Expiry Date</label>
                <input type="month" id="expiry-date" name="expiry-date" required>
            </div>

            <div class="form-group">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" required placeholder="Enter CVV">
            </div>

            <!-- Payment Method -->
            <div class="form-group">
                <label for="payment-method">Payment Method</label><br>
                <input type="radio" id="credit-card" name="payment-method" value="credit-card" checked> 
                <label for="credit-card">Credit Card</label><br>
                <input type="radio" id="paypal" name="payment-method" value="paypal">
                <label for="paypal">PayPal</label>
            </div>

            <!-- Confirmation -->
            <button type="submit" class="btn-submit">Confirm Payment</button>
        </form>
    </div>
    <h2> Welcome to Mr . ${email} </h2>
</body>
</html>
