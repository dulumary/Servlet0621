package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class ServletTest06Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// 두개의 수를 전달 받는다. 
		String numberString1 = request.getParameter("number1");
		String numberString2 = request.getParameter("number2");
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		int addtion = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// {"addtion":1524, "subtraction":141, "multiplication":21511, "division":15}
		
		out.println("{\"addtion\":" + addtion + ", \"subtraction\":" + subtraction + ", \"multiplication\":" + multiplication + ", \"division\":" + division + "}");
		
		
	}

}
