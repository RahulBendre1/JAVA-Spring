<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>studentForm.jsp</h1>
	<form action="studentCreate1">
		Validator interface<br>
		�̸� <input type="text" name="name" value="${student.name}">${error.field1}<br>
		���̵� <input type="text" name="id" value="${student.id}">${error.field2}<br>
		<input type="submit" value="����"><br>
	</form>
	<hr>
	<form action="studentCreate2">
		Spring framework<br>
		�̸� <input type="text" name="name" value="${student.name}">${error.field1}<br>
		���̵� <input type="text" name="id" value="${student.id}">${error.field2}<br>
		<input type="submit" value="����"><br>
	</form>

</body>
</html>