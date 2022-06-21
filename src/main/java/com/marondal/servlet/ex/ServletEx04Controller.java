package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class ServletEx04Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일 입력 받고 적당히 이쁘게 html로 결과 만들기 
		String name = request.getParameter("name");
		// 20020311
		String birthday = request.getParameter("birthday");
		
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1;
		
		// 테이블 에 출력
		out.println("<html> <head><title>정보</title></head>");
		out.println("<body>");
		out.println("<table border=1>");
		out.println("<tr> <td>이름</td> <td>" + name + "</td> </tr>");
		out.println("<tr> <td>나이</td> <td>" + age + "</td> </tr>");
		out.println("</table>");
		out.println("</body></html>");
		
		
		
		
		
		
	}

}
