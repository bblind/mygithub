<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<html>
<head>
<script>
	function refresh() {
		/* var url = $("#basePath").val() + "user/check.jpg?number="+Math.random();  
		$("#img").attr("src",url); */
		document.getElementById("img").src = document.getElementById("img").src
				+ "?nocache=" + new Date();

	}
</script>
</head>
<body>
	<h2>Login Page</h2>

	<%
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://"
				+ request.getServerName() + ":" + request.getServerPort()
				+ path + "/";
	%>
	
	<form action="user/login" method="post">
		Username: <input type="text" name="username" value=""><br>
		<br> Password: 
		<input type="password" name="pwd" value=""><br>
		<br>
		<div>
			<label>验证码:</label> <input type="text" name="validationCode" /> <img
				id="img" src="<%=basePath%>user/check.jpg" onclick="refresh()">
		</div>
		<input type="hidden" name = "token" value = "<%=session.getAttribute("token") %>"></input>
		<input type="submit" value="登陆"">
	</form>
</body>
</html>
