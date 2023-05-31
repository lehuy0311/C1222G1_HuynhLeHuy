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
    <title>Delete Product</title>
</head>
<body>
<form method="post">
    <a href="/products">Back to view</a>
    <p>ID: ${requestScope["product"].getId()}</p>
    <p>Name: ${requestScope["product"].getName()}</p>
    <p>Describe: ${requestScope["product"].getDescribe()}</p>
    <p>Price: ${requestScope["product"].getPrice()}</p>
    <input type="submit" value="Confirm Delete">
</form>
</body>
</html>