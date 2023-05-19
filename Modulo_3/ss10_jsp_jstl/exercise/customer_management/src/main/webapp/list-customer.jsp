<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/19/2023
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<div class="row">
    <div class="col-4"></div>
    <div class="col-4 m-3">
        <table class="table table-striped" style="border: 1px dodgerblue solid;border-collapse: separate;border-spacing: 0">
            <thead style="border-style: dashed">
            <tr style="text-align: center">
                <th colspan="4">Danh sách khách hàng</th>
            </tr>
            <tr>
                <th>Tên</th>
                <th>Ngày Sinh</th>
                <th>Địa chỉ</th>
                <th>Ảnh</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="element" items="${customerList}">
                <tr>
                    <th>${element.name}</th>
                    <td>${element.dateOfBirth}</td>
                    <td>${element.address}</td>
                    <td><img src="${element.linkImage}" style="width: 100px"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="col-2"></div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>


