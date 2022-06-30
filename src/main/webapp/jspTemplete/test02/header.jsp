<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<header class="d-flex">
			<div class="logo col-2 d-flex align-items-center"> 
				<h1 class="text-success">Melong</h1>
			</div>
			
			<div class="search col-10 d-flex align-items-center">
				<form method="get" action="/jspTemplete/test02/detail.jsp">
				<div class="input-group mb-3 col-7">
				  <input type="text" class="form-control" name="title">
				  <div class="input-group-append">
				    <button class="btn btn-success" type="submit">검색</button>
				  </div>
				</div>
				</form>
			</div>
			
			
		</header>