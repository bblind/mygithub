<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>标题标题标题</title>

<style type="text/css">
body {
	text-align: center;
	background-color: #F0FFFF;
}

#welcome {
	padding-bottom: 0.25em;
	background-color: #303030;
	text-align: right;
}

#welcomeWord {
	float: left;
	color: white;
}

#authorname {
	font-family: "sans-serif";
	width: 5em;
	padding-right: 1.5em;
}

#authordate {
	font-family: "Arial";
	width: 43.5em;
}

#userName {
	width: 5em;
	padding-right: 1.5em;
}

#content {
	margin: 0 auto;
	white-space: normal;
	width: 50em;
}

#line {
	text-align: center;
	width: 50em;
}

#comment {
	margin: 0 auto;
	white-space: normal;
	width: 50em;
}

#lastDate {
	width: 43.5em;
}

#commentSpace {
	background-color: #F0FFFF;
	width: 50em;
	height: 10em;
}

.FirstLine {
	background-color: LightBlue;
}
</style>

</head>
<body>

	<div id="welcome">
		<div id="welcomeWord">${username}</div>
		<form action="" method="get">
			<!--搜索框-->
			<input name="" type="text" />
			<!--搜索按钮-->
			<a href="http://blog.csdn.net/gebitan505/article/details/44455235/">
				<input name="" value="搜索" type="button" />
			</a>
		</form>
	</div>


	<h1 align="center">${post.title}</h1>

	<table cellspacing="0" align="center">
		<tr>
			<td id="authorname" class="authorinfo" align="left"><c:out
					value="${post.username}" /></td>
			<td align="left" id="authordate" class="authorinfo" align="left"><c:out
					value="${post.date}" /></td>
		</tr>
	</table>

	<div id="content" align="left">${post.content}</div>

		<hr>
	</div>

	<c:forEach items="${replys}" var="reply">
		<table cellspacing="0" align="center">
			<tr>
				<td id="userName" class="FirstLine" align="left"><c:out
						value="${reply.username}" /></td>
				<td align="left" id="lastDate" class="FirstLine"><c:out
						value="${reply.date}" /></td>
			</tr>
		</table>

		<div id="comment" align="left">
			<c:out value="${reply.content}" />
		</div>
	</c:forEach>

<form action="doReply" method="post">
<input type="text" name="content"/>
<input type="submit" value="回复">
<input type="hidden" value="${post.id}" name="pId">
</form>
	<!--<a  href="">登录</a>以后才可发言-->
	<div>
		<form anction="index" method="get">
			<textarea id="commentSpace" rows="10" cols="30"></textarea>
			<br />
			<input type="hidden" value="${post}" name="pId">
				<input type="hidden" value="${post.id}" name="pId">
				</input>
				<input value="回复" type="submit" />
			
		</form>
	</div>


</body>
</html>