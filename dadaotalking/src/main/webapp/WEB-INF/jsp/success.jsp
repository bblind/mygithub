<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
    
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面标题</title>

<style type="text/css" media="screen">


#welcome{
	padding-bottom:0.25em;
	bording:0;
	margin:0;
	background-color:#303030;
	text-align:right;
}
#welcomeWord{
	float:left;
	color:white;
}

body {
	
	background-color:#F0FFFF;
}

h2 {
	clear: both;
	border: 0;
	margin: 0;
	padding-top: 30px;
	font-size: 13px;
}

p {
	border: 0;
	margin: 0;
	padding: 0;
	padding-bottom: 20px;
}

ul {
	text-align:center;list-style-type:none;
	border: 0;
	margin: 0;
	padding: 0;
}

table {
	margin: 0 auto;
	
}

h1 {
	font-size: 4em;
	text-align: center;
}

#mainTable th {
	font-size: 1.5em;
}

#maintabletitle1 {
	padding-right: 10em;
}

#maintabletitle2 {
	padding-right: 2em;
}

#maintabletitle3 {
	padding-right: 2em;
}

#maintabletitle4 {
	padding-right: 2em;
}

#postSpace{
    background-color:#F0FFFF ;
    width:60em;
    height:8em;
}

#post{
	text-align:center;
	
}
#space{
	margin:10em;
}

#space2{
	margin:1.5em;
}

#theme{
	width:56em;
}



</style>

</head>
<body>

<div id = "welcome">
<div id = "welcomeWord">welcome,${username}</div>
<form action="" method="get">
<!--搜索框-->
<input name="" type="text" />
<!--搜索按钮-->
<a href = "http://blog.csdn.net/gebitan505/article/details/44455235/">
<input name="" value = "搜索" type="button" />
</a>
</form>
</div>



<h1>板块名称</h1>


	
	<table id="mainTable" frame = box rules = rows>
		<th id="maintabletitle1">帖子</th>
		<th id="maintabletitle2">作者</th>
		<th id="maintabletitle3">回复量</th>
		<th id="maintabletitle4">发帖时间</th>
		
		<c:forEach items="${postList}" var="post">
		<tr>
		<td>
		<a href = "/ssmweb/detail?pId=${post.id}"><c:out value="${post.title}"/></a>
		</td>
		<td>
		<c:out value = "${post.username}"/>
		</td>
		<td>
		<c:out value = "${post.list.size()}"/>
		</td>
		<td>
		<c:out value = "${post.date}"/>
		</td>
		</tr>
		</c:forEach>
		
	</table>

<div id = "space"> </div>

<form id = "post" anction="postPage">
	<hr>
	主题：
	<input id ="theme" name ="" type = "text">
	<div id = "space2"></div>
    <textarea id = "postSpace" rows="10" cols="60"></textarea>
    <br/>
    <input name ="" value="发帖" type ="submit">
</form>
<form action="postPage"><input value="发帖" type ="submit"></form>

</body>
</html>