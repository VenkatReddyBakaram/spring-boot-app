<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up Form - Light Green Theme</title>
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
        .signup-container {
            background-color: #ffffff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }
        .signup-container h2 {
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
        .signup-btn {
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
        .signup-btn:hover {
            background-color: #388e3c; /* Darker green */
        }
        .signup-btn:active {
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
<div class="signup-container">
    <h2>Sign Up</h2>
    <form action="./handle_signup" method="post">        
        <div class="form-group">
            <label for="fullname">Full Name</label>
            <input type="text" id="fullname" name="fullname" placeholder="Enter your full name" required>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Create a password" required>
        </div>
        <div class="form-group">
            <label for="confirm-password">Confirm Password</label>
            <input type="password" id="confirm-password" name="confirm-password" placeholder="Confirm your password"
                   required>
        </div>
        <button type="submit" class="signup-btn">Sign Up</button>
        <div class="form-footer">
            <p>Already have an account? <a href="./login">Login</a></p>
        </div>
    </form>
</div>
</body>
</html>
