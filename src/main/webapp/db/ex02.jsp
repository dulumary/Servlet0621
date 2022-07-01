<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.marondal.common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DATA BASE 조회</title>
</head>
<body>
<%-- new_user --%>

<%
	MysqlService mysqlService = MysqlService.getInstance();
	mysqlService.connect();
	
	String query = "SELECT * FROM `new_user`;";
	ResultSet resultSet = mysqlService.select(query);

%>

	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>생년월일</th>
				<th>이메일</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		<% while(resultSet.next()) { %>
			<tr>
				<td><%= resultSet.getString("name") %></td>
				<td><%= resultSet.getString("yyyymmdd") %></td>
				<td><%= resultSet.getString("email") %></td>
				<td><a href="/db/ex02/delete?id=<%= resultSet.getInt("id") %>">삭제</a></td>
			</tr>
		<%} %>
		
		</tbody>
	
	</table>



</body>
</html>