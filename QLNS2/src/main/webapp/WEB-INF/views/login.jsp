<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng nhập</title>
<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
	<div class="pen-title">
	  <h1>Đăng nhập</h1>
	</div>
	<!-- Form Module-->
	<div class="module form-module">
	  <div class="toggle">
	  <a href="index">X</a>
	  </div>
	  <div class="form">
	    <div id="message">${message}</div>
	    <form action="QLNSDispatcher" method="post">
	      <input type="text" name="userName" placeholder="Tên tài khoản"/>
	      <input type="password" name="password" placeholder="Mật khẩu"/>
	      <input id="dangnhap" type="submit" value="Đăng nhập"/>
	    </form>
	  </div>
	  
	  <div class="cta"><a href="#">Quên mật khẩu?</a></div>
	</div>
</body>

</html>