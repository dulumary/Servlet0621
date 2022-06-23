<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// cm 단위의 길이 
		// 변환할 단위 (체크박스 기반의 여러개)
		
		int length = Integer.parseInt(request.getParameter("length"));
		// 변환할 단위 여러개 
		String[] units = request.getParameterValues("units");
	// {inch, yard};
	
	%>

</body>
</html>