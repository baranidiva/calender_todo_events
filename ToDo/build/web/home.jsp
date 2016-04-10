<%-- 
    Document   : Home
    Created on : Mar 21, 2016, 9:53:16 PM
    Author     : Elcot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <img src="Events-Logo.jpg" style="width:1350px;height:120px;">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body background="log.jpg">
        <h1><font color="white" >Home</font></h1>
        <br/><br/><input type="button" value="  Profile " style="width:100px;height:30px;" >
        <br/><br/><input type="button" value=" Settings " style="width:100px;height:30px;">
        <form action="todos.jsp" method="post"><br/><br/><input type="submit" value="  To Do   " style="width:100px;height:30px;"></form>>
        <form method="link" action="signout.jsp">
            <br/><input type="submit" value="SignOut" style="width:100px;height:30px;">
        </form>
    </body>
</html>
