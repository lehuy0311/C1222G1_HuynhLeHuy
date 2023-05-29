<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/CalculatorServlet">
  <label for="num1">
    So thu nhat:
  </label>
  <input type="number" name="num1" id="num1"/>
  <label for="num2">
    So thu hai:
  </label>
  <input type="number" name="num2" id="num2"/>
  <input type="submit" value="Sum">
</form>