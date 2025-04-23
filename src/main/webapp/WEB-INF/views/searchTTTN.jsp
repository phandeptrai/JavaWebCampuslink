<%@page import="com.phandeptrai.dtos.ThongTinTNCVResponse"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form:form modelAttribute="command" action="${pageContext.request.contextPath}/search/result" method="get">
		<form:input path="searchString"/><br></br>
		<input type="submit" value="timkiem"/> 
	</form:form>
	

		<h2>Ket Qua tim kiem</h2>
					<c:if test="${not empty responsett }">
		<table border=1>

				<thead>
					<tr>
						<th>SoCMND</th>
						<th>Hoten</th>
						<th>MaNganhTN</th>
						<th>MaTruong</th>
						<th>MaNganhCT</th>
						<th>TenCongTy</th>
						<th>ThoiGianLamViec</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${responsett.soCMND }</td>
						<td>${responsett.hoTen }</td>
						<td>${responsett.maNganhTN }</td>
						<td>${responsett.maTruong }</td>
						<td>${responsett.maNganhCV }</td>
						<td>${responsett.tenCongTy }</td>
						<td>${responsett.thoiGianLamViec }</td>
					</tr>


				
				</tbody>
				
		</table>
	</c:if>	
	<c:if test="${empty responsett }">
		<h2>khong tim thay</h2>
	</c:if>
	<hr/>
</body>
</html>