<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/5/2023
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Edit Contract</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<form action="/ContractServlet?action=edit" method="post">
  <table class="table table-dark table-hover container-f ">
    <thead>
    <tr style="text-align: center">
      <th class="col-1" scope="col">Mã hợp đồng</th>
      <th class="col-2" scope="col">Ngày làm hợp đồng</th>
      <th class="col-1" scope="col">Tiền đặt cọc</th>
      <th class="col-1" scope="col">Số lượng xe</th>
      <th class="col-1" scope="col">Mã phương thức thanh toán</th>
      <th class="col-1" scope="col">Mã xe</th>
      <th class="col-3" scope="col">Mã nhân viên</th>
      <th class="col-2" scope="col">Mã khách hàng</th>
    </tr>
    </thead>
    <tbody style="text-align: center">
    <tr>
      <td class="col-1 "><input scope="row" name="idContract_edit" readonly value="${hop_dong.getMa_hop_dong()}"></td>
      <td class="col-2"><input name="dateContract_edit" value="${hop_dong.getNgay_lam_hop_dong()}" ></td>
      <td class="col-1"><input  name="deposits_edit" value="${hop_dong.getTien_dat_coc()}"></td>
      <td class="col-1"><input  name="quantityCar_edit" value="${hop_dong.getSo_luong_xe()}"></td>
      <td class="col-1"><input  name="idPayment_edit" value="${hop_dong.getMa_phuong_thuc_thanh_toan()}"></td>
      <td class="col-1"><input name="idCar_edit" value="${hop_dong.getMa_xe()}"></td>
      <td class="col-3"><input  name="idEmployee_edit" value="${hop_dong.getMa_nhan_vien()}"></td>
      <td class="col-2"><input  name="idCustomer_edit" value="${hop_dong.getMa_khach_hang()}"></td>
      <td class="col-1">
        <button class="btn btn-outline-light" type="submit" style="width: 40px"><span>
                <i class="fa-regular fa-circle-check"></i></span></button>
      </td>
    </tr>
    </tbody>
  </table>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
