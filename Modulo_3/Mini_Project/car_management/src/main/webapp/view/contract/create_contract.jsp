<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/3/2023
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/ContractServlet?action=create" method="post">
    STT: <input type="id" name="idContract"><br>
    Ngày làm hợp đồng: <input type="date" name="dateContract"><br>
    Tiền đặt cọc: <input type="number" name="deposits"><br>
    Số lượng xe: <input type="number" name="quantityCar"><br>
    Mã Phương thức thanh toán: <input type="number" name="idPayment"><br>
    Mã xe:  <input type="number" name="idCar"><br>
    Mã nhân viên:  <input type="number" name="idEmployee"><br>
    Mã khách hàng:  <input type="number" name="idCustomer"><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
