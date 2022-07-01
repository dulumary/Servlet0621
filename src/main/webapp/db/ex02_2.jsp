<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 입력</title>
</head>
<body>
		
	<form method="post" action="/db/ex02/insert">
		<label>이름 : </label> <input type="text" name="name"> <br>
		<label>생년월일 : </label> <input type="text" name="yyyymmdd"> <br>
		<label>자기소개</label> <br>
		<textarea rows="5" cols="50" name="introduce"></textarea> <br>
		<label>이메일 : </label> <input type="text" name="email"> <br>
		<button type="submit">추가</button>
	</form>

</body>
</html>