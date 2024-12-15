<%-- 
    Document   : slidebar
    Created on : Dec 6, 2024, 7:19:14 PM
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
        <<form action="excute" method="Post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text"  name="x" id="x" ></td>
                </tr>        
                <!--================-->
                <tr>
                    <td></td>
                    <td><input type="text"  name="y" id="y" ></td>
                </tr>
                <!--================-->
                <tr>
                    <td>R</td>
                    <td><input type="text   "  name="result" id="rs" ></td>
                </tr>
                    
                <!--==========Drop list======-->
                <tr>                
                    <td>Select:</td>
                    <td>
                        <select name="select">
                            <option  value="option1" >Option1</option>
                            <option value="option2" >Option2</option>
                        </select>
                    </td>
                        
                </tr>
                <!--========Checked box========-->
                <tr>
                    <td>Check box:</td>
                    <td>                               
                        <input type="checkbox" name="checkbox1" id="check1" value="ON"   />
                        <label for="check1">Check1</label>
                            
                        <input type="checkbox" name="checkbox2" id="check2" value="ON" />
                        <label for="check2">Check2</label>
                    </td>
                </tr>
                <!--========radio========-->
                <tr>
                    <td>Option:</td>
                    <td>
                        <input type="radio" name="option" value="option1" id="option1"   />
                        <label for="option1" >Option1</label>
                        <input type="radio" name="option" value="option2" id="option2"   />
                        <label for="option2" >Option2</label>
                    </td>
                </tr>
                <!--========buttom========-->
                <tr>
                    <td>
                        <input type="Submit" value="Submit">
                    </td>
                    <td style="color:red">err</td>
                </tr>
            </table>
        </form>
            
    </body>
</html>
