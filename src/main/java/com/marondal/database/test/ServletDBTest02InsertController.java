package com.marondal.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/test02/insert")
public class ServletDBTest02InsertController extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `favorite` (`name`, `url`, `createdAt`, `updatedAt`) \r\n"
				+ "VALUES \r\n"
				+ "('" + name + "', '" + url + "', now(), now());";
		
		mysqlService.update(query);
		
		try {
			response.sendRedirect("/db/test02.jsp");
		} catch (IOException e) {


			e.printStackTrace();
		}
		
		
	}

}
