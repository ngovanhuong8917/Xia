<%-- 
    Document   : edituser
    Created on : Nov 24, 2024, 5:08:17 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./editUser?id=${user.getId()}" method="Post">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text"  name="name" id="name" value= "${user.getName()}" ></td>
                </tr>        
                <!--================-->
                <tr>
                    <td>Position</td>
                    <td><input type="text"  name="position" id="postion" value= "${user.getPosition()}" ></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><input type="text"  name="age" id="age" value="${user.getAge()}" ></td>
                </tr>
                    <td>
                        <input type="Submit" value="Edit">
                    </td>
            </table>
        </form>

    </body>
</html>
