<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>

	<form:form modelAttribute="command" action="${pageContext.request.contextPath}/search/sinhvien" method="get">
		<form:input path="searchString"/><br></br>
		<input type="submit" value="timkiem"/> 
	</form:form>
	<hr/>
	
	<c:if test="${not empty results }">
		<h2>Ket Qua tim kiem</h2>
		
		<table border=1>
				
				<thead>
					<tr>
						<th>SoCMND</th>
						<th>Hoten</th>
						<th>Email</th>
						<th>SoDt</th>
						<th>DiaChi</th>
					</tr>
				</thead>
				<tbody>
				
				<c:forEach items="${results}" var="sinhVien">
					<tr>
						<td>${sinhVien.soCMND }</td>
						<td>${sinhVien.hoTen }</td>
						<td>${sinhVien.email }</td>
						<td>${sinhVien.soDt }</td>
						<td>${sinhVien.diaChi }</td>
					</tr>
				</c:forEach>

				
				</tbody>
				
		</table>
	</c:if>
	<c:if test="${empty results }">
		<h2>khong tim thay</h2>
	</c:if>
</body>
</html>