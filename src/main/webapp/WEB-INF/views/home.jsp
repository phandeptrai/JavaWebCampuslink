<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<style>
	.error {
		color: red;
		font-size: small;
	}
</style>

<body>

	<form:form modelAttribute="ThongTinTNRequest" action="${pageContext.request.contextPath}/sinhvien/save"
		method="post">

				Họ Tên: <form:input path="hoTen" /><br>
			<form:errors path="hoTen" cssClass="error"/><br><br>
			
			Số CMND: <form:input path="soCMND" /><br>
			<form:errors path="soCMND" cssClass="error"/><br><br>
			
			Số điện thoại: <form:input path="soDt" /><br>
			<form:errors path="soDt" cssClass="error"/><br><br>
			
			Email: <form:input path="email" /><br>
			<form:errors path="email" cssClass="error"/><br><br>
			
			Địa chỉ: <form:input path="diaChi" /><br>
			<form:errors path="diaChi" cssClass="error"/><br><br>
			
			Trường:
			<form:select path="maTruong">
			    <form:options items="${truongs}" itemValue="maTruong" itemLabel="tenTruong" />
			</form:select><br>
			<form:errors path="maTruong" cssClass="error"/><br><br>
			
			Ngành:
			<form:select path="maNganh">
			    <form:options items="${nganhs}" itemValue="maNganh" itemLabel="tenNganh" />
			</form:select><br>
			<form:errors path="maNganh" cssClass="error"/><br><br>
			
			Hệ tốt nghiệp: <form:input path="heTN" /><br>
			<form:errors path="heTN" cssClass="error"/><br><br>
			
			Ngày tốt nghiệp: <form:input path="ngayTN" type="date" /><br>
			<form:errors path="ngayTN" cssClass="error"/><br><br>
			
			Loại tốt nghiệp: <form:input path="loaiTN" /><br>
			<form:errors path="loaiTN" cssClass="error"/><br><br>


		<!-- Submit -->
		<input type="submit" value="Lưu" />

	</form:form>

</body>
</html>
