<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
<style>
    body {
        padding-top: 4.5rem;
        padding-bottom: 4.5rem;
    }
</style>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Employee Management</a>
                <button class="navbar-toggler" type="button"
                    data-bs-toggle="collapse" data-bs-target="#navbarColor01"
                    aria-controls="navbarColor01" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarColor01">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item"><a class="nav-link active"
                            href="../index.jsp">Home <span class="visually-hidden">(current)</span>
                        </a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main>
        <div class="container">
            <h1 class="text-center mt-5">Registration Successful</h1>
            <div class="alert alert-success text-center mt-3">
                <strong>Success!</strong> Your registration has been completed successfully.
            </div>
            <div class="text-center mt-3">
                <a href="../index.jsp" class="btn btn-primary">Go to Home</a>
                <a href="employeeRegistrationForm.jsp" class="btn btn-secondary">Register Another Employee</a>
            </div>
        </div>
    </main>
    <footer class="fixed-bottom bg-primary">
        <div class="container-fluid text-center py-3">
            <p class="mb-0">
                &copy;
                <%=java.time.LocalDate.now().getYear()%>
                Employee Management
            </p>
        </div>
    </footer>
    <script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>
