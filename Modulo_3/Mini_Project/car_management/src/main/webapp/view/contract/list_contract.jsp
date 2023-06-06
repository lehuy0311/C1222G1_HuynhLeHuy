<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/3/2023
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Contract</title>
    <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css"/>
</head>
<body>
<h1>Danh sách hợp đồng</h1>

<a href="/ContractServlet?action=showFormCreateContract">Them moi hop dong</a>
<form method="get" action="/ContractServlet">
    <table  id="tableContract" class="table table-striped">
        <thead>
        <tr>
            <th>STT</th>
            <th>Ngày làm hợp đồng</th>
            <th>Tiền đặt cọc</th>
            <th>Số lượng xe</th>
            <th>Mã Phương thức thanh toán</th>
            <th>Mã xe</th>
            <th>Mã nhân viên</th>
            <th>Mã khách hàng</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="contract" varStatus="loop">
            <tr>
                <td>
                    <c:out value="${contract.ma_hop_dong}"/>
                </td>
                <td>
                    <c:out value="${contract.ngay_lam_hop_dong}"/>
                </td>
                <td>
                    <c:out value="${contract.tien_dat_coc}"/>
                </td>
                <td>
                    <c:out value="${contract.so_luong_xe}"/>
                </td>
                <td>
                    <c:out value="${contract.ma_phuong_thuc_thanh_toan}"/>
                </td>
                <td>
                    <c:out value="${contract.ma_xe}"/>
                </td>
                <td>
                    <c:out value="${contract.ma_nhan_vien}"/>
                </td>
                <td>
                    <c:out value="${contract.ma_khach_hang}"/>
                </td>
                <td >
                    <a href="/ContractServlet?action=showFormEditContract&id=${contract.ma_hop_dong}">
                        <button class="btn btn-outline-red col-6" type="button" style="width: 100px"><span><i
                                class="fa-regular fa-pen-to-square"></i></span></button>
                    </a>
                </td>
                <td>
                    <button type="button" class="btn btn-primary"
                            data-bs-toggle="modal" data-bs-target="#exampleModal"
                            onclick="remove(${contract.ma_hop_dong},'${contract.ngay_lam_hop_dong}')">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Xóa hợp đồng</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <h3>Bạn có chắc chắn xóa hợp dồng có tên:
                    <span style="color:red" id=""></span>
                </h3>
            </div>
            <div class="modal-footer">
                <form action="/ContractServlet?action=delete" method="post">
                    <input type="hidden" name="idDelete" id="idDelete">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Không</button>
                    <button type="submit" class="btn btn-primary">Có</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script src="bootstrap520/js/bootstrap.bundle.js"></script>
<script>
    $(document).ready(function () {
        $('#tableContract').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        });
    });

    function remove(id) {
        document.getElementById("idDelete").value = id;
    }
</script>
</body>
</html>
