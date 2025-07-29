<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Danh sách Hạt giống</title>
</head>
<body>
<h2>Danh sách Hạt giống</h2>
<a href="/seeds/create">+ Thêm mới</a><br/><br/>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Tên hạt giống</th>
    <th>Số lượng</th>
    <th>Danh mục</th>
    <th>Hành động</th>
  </tr>
  <c:forEach var="seed" items="${seeds}">
    <tr>
      <td>${seed.id}</td>
      <td>${seed.seedName}</td>
      <td>${seed.quantity}</td>
      <td>${seed.category.cateName}</td>
      <td>
        <a href="/seeds/edit?id=${seed.id}">Sửa</a> |
        <a href="/seeds/delete?id=${seed.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa?');">Xóa</a>
      </td>
    </tr>
  </c:forEach>
</table>

<!-- Phân trang -->
<div>
  <a href="?page=${currentPage - 1}">Trước</a> |
  <a href="?page=${currentPage + 1}">Sau</a>
</div>
</body>
</html>
