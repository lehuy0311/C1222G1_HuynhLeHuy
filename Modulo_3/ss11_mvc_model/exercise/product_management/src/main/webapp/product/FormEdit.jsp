<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/31/2023
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Edit</title>
</head>
<body>
<a href="/products">Back to view</a>
<form action="/products?action=delete" method="post">
    <h1>Form Edit</h1>
    <label>IdEdit:</label>
    <input type="text" name="name" value="${requestScope["product"].getId()}"><br>
    <label>Name: </label>
    <input type="text" name="name" value="${requestScope["product"].getName()}"><br>
    <label>Describe: </label>
    <input type="text" name="describe" value="${requestScope["product"].getDescribe()}"><br>
    <label>Price: </label>
    <input type="text" name="price" value="${requestScope["product"].getPrice()}"><br>
    <button style="margin-right: 10px" type="submit">Submit</button>
</form>
</body>
</html>