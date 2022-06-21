package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02")
public class ServletEx02Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// html 로 1 부터 10까지의 합을 한 결과를 보여준다. 
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		int sum = 0; 
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		out.println("<html> <head> <title>합계</title> </head>"); 
		out.println("<body> <h2> 합계 : " + sum + "</h2> </body> </html>");
		
		
	}

}
