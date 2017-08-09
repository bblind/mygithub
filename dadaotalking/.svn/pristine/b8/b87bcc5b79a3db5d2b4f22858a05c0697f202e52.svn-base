<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> 标题标题标题 </title>

    <style type="text/css">
    body{
        text-align: center;
        background-color: #F0FFFF;
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
            font-family: "sans-serif";
            width:5em;
            padding-right: 1.5em;
        }
        #authordate {
            font-family: "Arial";
            width: 43.5em;
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

        #commentSpace{
            background-color:#F0FFFF ;
            width:50em;
            height:10em;
        }

        .FirstLine{
            background-color: LightBlue;
        }

    </style>

</head>
<body>

<div id = "welcome">
    <div id = "welcomeWord">${username}</div>
    <form action="" method="get">
        <!--搜索框-->
        <input name="" type="text" />
        <!--搜索按钮-->
        <a href = "http://blog.csdn.net/gebitan505/article/details/44455235/">
            <input name="" value = "搜索" type="button" />
        </a>
    </form>
</div>


<h1 align="center">
    ${post.title}
</h1>

<table cellspacing="0" align="center">
    <tr>
        <td id = "authorname" class = "authorinfo"> username <c:out value ="${authorname}"/></td>
        <td align="left" id = "authordate" class = "authorinfo"> date <c:out value = "${authordate}"/></td>
    </tr>
</table>

<div id = "content" align="left" >
${post.content}
    近日，一段关于“郑州街头放一箱硬币，每人最多取5个”现
</div>

<div>
    <hr id = "line" >
</div>

<!--<c:forEach items="${postList}" var="post">-->
<table cellspacing="0" align="center">
    <tr>
        <td id = "userName" class = "FirstLine"> username <c:out value ="${username}"/></td>
        <td align="left"id = "lastDate" class = "FirstLine"> date <c:out value = "${date}"/></td>
    </tr>
</table>

<div id = "comment" align="left">
</div>
<!--</c:forEach>-->


    <!--<a  href="">登录</a>以后才可发言-->
<div>
    <textarea id = "commentSpace" rows="10" cols="30">
    </textarea>
    <br/>
    <table id ="reply" >
        <input name ="" value="回复" type ="button">
    </table>
</div>

</body>
</html>