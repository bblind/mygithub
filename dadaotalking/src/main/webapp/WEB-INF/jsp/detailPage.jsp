<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
    body{
        text-align: center;
    }

        #welcome{
            padding-bottom:0.25em;
            background-color:#303030;
            text-align:right;
        }
        #welcomeWord{
            float:left;
            color:white;
        }

        #authorname{
            width:5em;
            padding-right: 1.5em;
        }
        #authordate{
            width:43.5em;
        }


        #userName {
            width:5em;
            padding-right: 1.5em;
        }


        #content{
            margin: 0 auto;
            white-space:normal;
            width: 50em;
        }

        #line{
            text-align:left;
            width:50em;
        }

        #comment{
            margin: 0 auto;
            white-space:normal;
            width: 50em;
        }

        #lastDate{
            width:43.5em;
        }

        .FirstLine{
            background-color: #E0FFFF;
        }

    </style>
<title>${post.title }</title>
</head>
<body>
	title:${post.title }<br><br>
	<br>
	<c:forEach items="${replys}" var="reply">
		评论：<c:out value="${reply.content}" /><br>
	</c:forEach>
	<form action="reply" method="post">
		content: <input type="text" name="content"><br> <br>
		<input type="submit" value="回复">
	</form>
</body>
</html>