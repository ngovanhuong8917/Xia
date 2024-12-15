
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

        <title>
            Login 
        </title>
    </head>
        
    <body  class= "bg-dark-subtle" >
        <form action ="login" method = "Post">    
   <main class="position-absolute top-50 start-50 translate-middle">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
    <div class="form-floating">
      <input type="email" class="form-control" id="email" placeholder="name@example.com" name="email" >
      <label for="floatingInput">Email address</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="password" placeholder="Password" name="password" >
      <label for="floatingPassword">Password</label>
    </div>
    <div class="form-check text-start my-3">
      <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault">
      <label class="form-check-label" for="flexCheckDefault">Remember me</label>
      <div colspan="2" style="color: red">${errorMessage}<i></i></div>
      <div><a href="register">Forgot Password?</a></div>
    </div>
    <button class="btn btn-primary w-100 py-2" type="submit">Sign in</button>
           Don't have an account?<a href="register">Register</a>
            </main>
            </div>
        </form>

    </body>
    </html>
