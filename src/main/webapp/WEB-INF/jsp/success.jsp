<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8f0; /* Light green background */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #ffffff; /* White background for the container */
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 300px;
        }
        h1 {
            color: #4CAF50; /* Green color for the header */
        }
        p {
            color: #555; /* Darker text for description */
        }
        .btn {
            background-color: #4CAF50; /* Green button */
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            font-size: 16px;
        }
        .btn:hover {
            background-color: #45a049; /* Slightly darker green on hover */
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Login Success</h1>
        <p>Welcome to your dashboard!</p>
        <!-- <p>Welcome Mr. ${emailId} !</p> -->

        <p>Welcome Mr. ${userDTO.email} !</p>
        <p>Welcome Mr. ${userDTO.password} !</p>


        <a href="./home" class="btn">Go to Dashboard</a>
    </div>

</body>
</html>
