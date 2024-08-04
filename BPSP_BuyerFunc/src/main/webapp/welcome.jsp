<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }
        .navbar {
            margin-bottom: 20px;
        }
        .welcome-message {
            margin-top: 50px;
            text-align: center;
        }
        .nav-link {
            font-size: 18px;
            color: #ffffff !important; /* Set text color to white */
            background-color: #007bff; /* Set background color */
            border-radius: 5px; /* Rounded corners */
            padding: 10px 20px; /* Padding around the link */
            transition: background-color 0.3s ease; /* Smooth color transition */
        }
        .nav-link:hover {
            background-color: #0056b3; /* Darker color on hover */
        }
        .nav-link.active {
            background-color: #0056b3; /* Active link color */
        }
    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">MyApp</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="Controller?action=home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Controller?action=buyersList">Buyers List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Controller?action=otherSection">Other Section</a>
                </li>
            </ul>
        </div>
    </nav>
    
    <!-- Welcome Message -->
    <div class="container welcome-message">
        <h2>Welcome, ${username}!</h2>
        <p>Use the navigation bar to access different sections.</p>
    </div>

    <!-- Bootstrap and jQuery JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
