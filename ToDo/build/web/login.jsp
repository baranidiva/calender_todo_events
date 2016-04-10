<%-- 
    Document   : Login
    Created on : Mar 21, 2016, 9:19:59 PM
    Author     : Elcot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="log.jpg">
        <h1 align="center"><font size="8" color="white">My ToDo's<br/>(Access your ToDo's from anywhere)</font><h1/>
        <h2 align="center"><font size="6" color="gray">LOGIN into your Profile...</font></h2>
        <center>
            <form method="POST" action="LoginServlet" onsubmit="return checkForm();">
            <h3><font size="6" color="white">Sign in Details</font><h3/>
                <font size="6" color="lightgray">
                    <br/>UserName  <input type="text" name="username">
                    <br/>Password  <input type="password" name="password">
                    <br/><input type="submit" value="Submit"><input type="reset" value="Reset">
                </font>
        </form>
            <br/><br/><br/><a href="signup.jsp">Click here if you are a new User</a>
        </center>
    </body>
</html>
