<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>

	<form:form modelAttribute="ThongTinTNRequest" action="${pageContext.request.contextPath}/sinhvien/save"
		method="post">

		<!-- ===== THÔNG TIN CÁ NHÂN ===== -->
		Họ Tên: <form:input path="hoTen" /><br><br>
		
		Số CMND: <form:input path="soCMND" required="true"/><br><br>

		Số điện thoại: <form:input path="soDt" /><br><br>

		Email: <form:input path="email" /><br><br>
		<form:errors path="email" cssClass="error" />

		Địa chỉ: <form:input path="diaChi" /><br><br>


		<!-- ===== THÔNG TIN HỌC VẤN ===== -->
		Trường:
		<form:select path="maTruong" required="true">
			<form:options items="${truongs}" itemValue="maTruong"
				itemLabel="tenTruong" />
		</form:select>
		<br><br>

		Ngành:
		<form:select path="maNganh" required="true">
			<form:options items="${nganhs}" itemValue="maNganh"
				itemLabel="tenNganh" />
		</form:select>
		<br><br>

		Hệ tốt nghiệp: <form:input path="heTN" /><br><br>

		Ngày tốt nghiệp: <form:input path="ngayTN" type="date" /><br><br>

		Loại tốt nghiệp: <form:input path="loaiTN" /><br><br>

		<!-- Submit -->
		<input type="submit" value="Lưu" />

	</form:form>

</body>
</html>
