<%-- 
    Document   : register
    Created on : Nov 28, 2024, 2:39:39 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>
            register
        </title>
        <form action ="register" method = "Post">
    </head>
    <body  class= "bg-dark-subtle" >
        
<!--        <form action ="register" method = "Post">
            <table>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">User Name</label>
                    <input type="username" class="form-control" id="username" aria-describedby="username">
                </div>    
                <tr>
                    <label for="exampleInputEmail1" class="form-label">Password</label>
                    <input type="username" class="form-control" id="username" aria-describedby="username">
                </tr>
                <tr>
                    <label for="exampleInputEmail1" class="form-label">Repeat Password</label>
                    <input type="username" class="form-control" id="username" aria-describedby="username">
                </tr>
                <tr>
                    <label for="exampleInputEmail1" class="form-label">Email:</label>
                    <input type="username" class="form-control" id="username" aria-describedby="username">
                </tr>

                <td>
                    <button class="btn btn-primary" type="submit">Sign Up</button>
                </td>
            </table>
        </form>-->
        
        
        
        
        
        
        <main class="position-absolute top-50 start-50 translate-middle">
            
             <h1 class="h3 mb-3 fw-normal"> Sign Up</h1>
         </div>
            <div class="form-floating">
      <input type="email" class="form-control" id="email" placeholder="Email" name ="email">
      <label for="floatingPassword">Email</label>

    </div>   
<!--    <div class="form-floating">
      <input type="username" class="form-control" id="username" placeholder="name@example.com" name ="username"  >
      <label for="floatingInput">User Name</label>
    </div>-->
    <div class="form-floating">
      <input type="password" class="form-control" id="password" placeholder="Password" name ="password">
      <label for="floatingPassword">Password</label>
    </div>
            
            <div class="form-floating">
      <input type="rpassword" class="form-control" id="rpassword" placeholder="RepeatPassword" name ="rpassword">
      <label for="floatingPassword">Repeat Password</label>

    <div class="form-check text-start my-3">
      <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault">
      <label class="form-check-label" for="flexCheckDefault">
        Remember me

      </label>
                          <div colspan="1" style="color: red">${errorMessage}<i></i></div>

    </div>
    <button  class="btn btn-primary w-100 py-2" type="submit">Sign up</button>
  
    </main>
    </form>
            

    </body>
</html>
