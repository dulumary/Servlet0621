package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// text/css MIME
		response.setContentType("text/plain");
		// 캐릭터셋, 인코딩
		response.setCharacterEncoding("utf-8");
		
		// 현재 날짜와 시간을 보여주는 페이지
		Date now = new Date();
		
		PrintWriter out = response.getWriter();
		out.println(now);
		
		
		SimpleDateFormat fomatter = new SimpleDateFormat("yyyy년 M월 d일 HH시mm분ss초");
		String dateString = fomatter.format(now);
		out.println(dateString);
		
		
	}
}
