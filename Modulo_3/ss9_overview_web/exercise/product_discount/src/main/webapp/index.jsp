<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <style>
    input{
      margin-bottom: 20px;
    }
  </style>
</head>
<body>
<form action="/display-discount" method="post">
  <h2>Product Discount Calculator</h2>
  <input type="text" name="ProductDescription" placeholder="Product Description">
  <br>
  <input type="text" name="ListPrice" placeholder="List Price">
  <br>
  <input type="text" name="DiscountPercent" placeholder="Discount Percent">
  <br>
  <input type="submit" id="elm-btn" value=" Calculate" >
</form>
</body>
</html>