<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form - Light Green Theme</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e8f5e9; /* Light green background */
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            background-color: #ffffff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }
        .login-container h2 {
            text-align: center;
            color: #2e7d32; /* Dark green */
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-size: 14px;
            color: #4caf50; /* Medium green */
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #c8e6c9; /* Light green border */
            border-radius: 5px;
        }
        .form-group input:focus {
            border-color: #66bb6a; /* Slightly darker green */
            outline: none;
            box-shadow: 0 0 4px rgba(102, 187, 106, 0.4);
        }
        .login-btn {
            display: block;
            width: 100%;
            padding: 10px;
            font-size: 16px;
            background-color: #4caf50; /* Medium green */
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .login-btn:hover {
            background-color: #388e3c; /* Darker green */
        }
        .login-btn:active {
            background-color: #2e7d32; /* Even darker green */
        }
        .form-footer {
            text-align: center;
            margin-top: 15px;
            font-size: 14px;
        }
        .form-footer a {
            color: #4caf50;
            text-decoration: none;
        }
        .form-footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form action="./doLogin" method="GET">       
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>
        </div>
        <button type="submit" class="login-btn">Login</button>
        <div class="form-footer">
            <p>Don't have an account? <a href="./signup">Sign up</a></p>
        </div>
    </form>
</div>
</body>
</html>
