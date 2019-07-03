<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 引入JSTL里面的core标签库，它里面包含了forEach、if、choose等标签，代替JSP的脚本和表达式。 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书馆首页</title>
<link href="/zdf/library/css/lis.css" rel="stylesheet">
</head>
<body>
	
	<%-- <a href='<c:url value="http://127.0.0.1:8190/zdf/library/" />'>继续选书</a> --%>
	<input type="button" class="gg" onclick="window.location.href='http://127.0.0.1:8190/zdf/library/'" value="继续选书" />
	<h1 class="hh">已选图书</h1>
	<c:forEach items="${debitList.books }" var="book">
		<table>
			<tr>
				<td class="t">
					${book.name }
				</td>
				<td>
					<%-- 此处把路径的一部分作为参数来使用，符合REST规范 --%>
					<a class="nu" href="/zdf/library/debit/remove/${book.id }">删除</a>
				</td>
				
			</tr>
		</table>
	</c:forEach>
	
</body>
</html>