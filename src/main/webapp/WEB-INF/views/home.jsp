<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<form action="/test/login" method="post">
	<input type="text" name="email">
	<input type="password"name="pwd">
	<input type="submit" value="제출">
</form>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
