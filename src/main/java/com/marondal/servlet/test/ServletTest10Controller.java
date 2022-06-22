package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10Controller extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// id와 password를 전달 받고 
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// map에 있는 id password와 파라미터로 전달 받은 id password를 비교해서 
		// 안내 문구 출력
		
		out.println("<html><head><title>로그인</title></head><body>");
		
		// id가 일치하지 않을때
		if(!id.equals(userMap.get("id"))) {
			out.println("<h1>아이디가 일치하지 않습니다 </h1>");
		} else if(!password.equals(userMap.get("password"))) { // password가 일치하이 않을때
			out.println("<h1>비밀번호가 일치하지 않습니다. </h1>");
		} else { //로그인 성공
			out.println("<h1>" + userMap.get("name") + "님 환영합니다. </h1>");
		}
		
		out.println("</body></html>");
		
	}

}
