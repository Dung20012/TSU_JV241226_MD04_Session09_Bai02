<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Form Hạt giống</title>
</head>
<body>
<h2>${seed.id == 0 ? 'Thêm mới' : 'Chỉnh sửa'} Hạt giống</h2>
<form action="/seeds/save" method="post">
  <input type="hidden" name="id" value="${seed.id}" />
  <label>Tên hạt giống:</label>
  <input type="text" name="seedName" value="${seed.seedName}" required/><br/>

  <label>Số lượng:</label>
  <input type="number" name="quantity" value="${seed.quantity}" required/><br/>

  <label>Danh mục ID:</label>
  <input type="number" name="category.id" value="${seed.category.id}" required/><br/>

  <button type="submit">Lưu</button>
</form>
<a href="/seeds">Quay lại danh sách</a>
</body>
</html>
