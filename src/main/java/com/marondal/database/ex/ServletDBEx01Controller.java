package com.marondal.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/ex01")
public class ServletDBEx01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		// DB 접속
//		try {
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			
//			// 서버 접속 주소, 아이디, 비번
//			String url = "jdbc:mysql://localhost:3306/dulumary_0530";
//			String userId = "root";
//			String password = "root";
//			
//			Connection connection = DriverManager.getConnection(url, userId, password);
//			Statement statement = connection.createStatement();
			
			String query = "INSERT INTO `used_goods`\r\n"
					+ "(`sellerId`, `title`, `price`, `description`, `picture`, `createdAt`, `updatedAt`)\r\n"
					+ "VALUE \r\n"
					+ "(3, '고양이 간식 팝니다', 2000, '저희 고양이가 까다로워서 안먹어요', NULL, now(), now());";
			
			// insert, update, delete
			// 실행된 행의 개수 
//			int count = statement.executeUpdate(query);
			
			// singletone - 디자인 패턴
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String selectQuery = "SELECT * FROM `used_goods`;";
			
			ResultSet resultSet = mysqlService.select(selectQuery);
			
			try {
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					int price = resultSet.getInt("price");
					
					out.println("제품명 : " + title + " 가격 : " + price);
				}
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
//			int count = mysqlService.update(query);
			
//			out.println("삽입 행의 개수 : " + count);
			
			
			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
