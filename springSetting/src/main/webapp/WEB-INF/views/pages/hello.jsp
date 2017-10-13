<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello</title>
</head>
<body>
<h2>Hello</h2>
<table>
	<tr>
		<td>아이디</td><td>이름</td><td>이메일</td>
	</tr>
<c:forEach var="member" items="${member }">
	<tr>
		<td>${member.id }</td><td>${member.name }</td><td>${member.email }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>