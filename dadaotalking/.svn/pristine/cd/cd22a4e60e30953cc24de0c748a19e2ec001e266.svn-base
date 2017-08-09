<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	welcome,${username}
	<br>
	<a href="/ssmweb/postPage">
		<button type="button">发帖</button>
	</a>
	<c:forEach items="${postList}" var="post">
		<a href="/ssmweb/detail?pId=${post.id}"><c:out value="${post.title}" /></a><br>
	</c:forEach>
</body>
</html>