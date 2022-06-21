package com.marondal.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 거쳐갈 페이지 url 패턴
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// request, response 문자 인코딩 설정
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		chain.doFilter(request, response);
	}

}
