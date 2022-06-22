<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>parameter 다루기 </title>
</head>
<body>

	<%-- 사용자 아이디, 이름, 나이 전달 받고 이쁘게 출력 --%>
	
	<%
		String userId = request.getParameter("user_id");
	
		// 하나의 파라미터 이름으로 여러개의 데이터가 전달될때 
		String[] foodArray = request.getParameterValues("food");	
		
		String foodString = "";
		for(int i = 0; i < foodArray.length; i++) {
			foodString += foodArray[i] + " ";
		}
	%>
	
	<table>
		<tr>
			<td>아이디</td>
			<td><%=userId %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%= request.getParameter("age") %></td>
		</tr>
		<tr>
			<td>동물</td>
			<td><%= request.getParameter("animal") %> </td>
		</tr>
		
		<tr>
			<td>음식</td>
			<td><%= foodString %></td>
		
		</tr>
		<tr>
			<td>과일</td>
			<td><%= request.getParameter("fruit") %></td>
		</tr>
	
	</table>

</body>
</html>