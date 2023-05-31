<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/31/2023
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form add</title>
</head>
<style>
    input {
        margin-bottom: 20px;
    }
</style>
<body>
<a href="/products">Back to view</a>
<%--<form action="" method="post">--%>
<%--    <label>ID: </label><input type="text" name="id" placeholder="input ID product" required><br>--%>
<%--    <label>Name: </label><input type="text" name="name" placeholder="input name product" required><br>--%>
<%--    <label>Describe: </label><input type="text" name="describe" placeholder="input description product" required><br>--%>
<%--    <label>Price: </label><input type="text" name="price" placeholder="input amount product" required><br>--%>
<%--    <button type="submit"></button>--%>
<%--</form>--%>
<form action="/products?action=create" method="post">
    <%--    <h1>Form Edit</h1>--%>
    <%--    <label>Name: </label>--%>
    <%--    <input type="text" name="name" value="${requestScope["product"].getName()}"><br>--%>
    <%--    <label>Describe: </label><input type="text" name="describe" value="${requestScope["product"].getDescribe()}"><br>--%>
    <%--    <label>Price: </label><input type="text" name="price" value="${requestScope["product"].getPrice()}"><br>--%>
    <%--    <button style="margin-right: 10px" type="submit">Submit</button>--%>
    <input type="number" name="newId">
    <input type="text" name="name">
    <input type="text" name="describe">
    <input type="text" name="price">
    <input type="submit">
</form>
</body>
</html>
