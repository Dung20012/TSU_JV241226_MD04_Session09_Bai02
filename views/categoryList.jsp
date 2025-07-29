<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Danh sách danh mục</title></head>
<body>
<h2>Danh sách danh mục</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Tên danh mục</th>
        <th>Mô tả</th>
    </tr>
    <c:forEach var="cate" items="${categories}">
        <tr>
            <td>${cate.id}</td>
            <td>${cate.cateName}</td>
            <td>${cate.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
