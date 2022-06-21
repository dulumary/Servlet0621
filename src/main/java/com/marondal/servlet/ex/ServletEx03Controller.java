package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class ServletEx03Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// 이름 생년월일 전달 받고, 이름과 나이 출력
		// name, birthday
		String name = request.getParameter("name");
		String birthDay = request.getParameter("birthday");
		// 19990423
		String yearString = birthDay.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1;
		
		// {"name":"kim", "age":22}
		out.println("{\"name\":\"" + name + "\", \"age\":" + age + "}");
//		out.println("{\"name\":\"" + name + "\", \"age\":22}");
		
		
		
//		out.println("<html><head><title>get method</title></head> <body>");
//		out.println("<h1>이름 : " + name + "</h1>");
//		out.println("<h3> 나이 : " + age + "</h3>");
//		out.println("</body></html");
		
		
		
		
	}

}
