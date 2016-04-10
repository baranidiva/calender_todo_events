<%-- 
    Document   : todos
    Created on : Mar 30, 2016, 10:58:31 PM
    Author     : Elcot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <img src="Events-Logo.jpg" style="width:1350px;height:120px;">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ToDo Page</title>
    </head>
    <body background="log.jpg">
        <center>
        <h1><font color="white">ToDo</font></h1>
        <font size="4" color="white">
        <form action="EventServlet" method="post">
        <br/><br/>Date<input type="text" name="date">
        Month<input type="text" name="month">
        Year<input type="text" name="year">
        <br/><br/>Event Description<input type="text" name="event">
        </font>
        <br/><br><input type="submit" value="Create an Event" name="create"></form>
        <br/><br><input type="submit" value="Delete an Event" name="delete">
        <form action="ViewServlet" method="post">
            <br/><br/>Date<input type="text" name="date">
        Month<input type="text" name="month">
        Year<input type="text" name="year">
            <br/><br><input type="submit" value="View an Event" name="view"></form>
        </center>>
    </body>
</html>
