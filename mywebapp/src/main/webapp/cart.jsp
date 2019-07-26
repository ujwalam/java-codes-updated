<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h4>Selected books</h4>
<ul>
<c:forEach var="aBook" items="${sbooks}">
	<li>${aBook}</li>
</c:forEach>
</ul>
<h4>Selected cars</h4>
<ul>
<c:forEach var="aCar" items="${scars}">
	<li>${aCar}</li>
</c:forEach>
</ul>
<h4>Selected bikes</h4>
<ul>
<c:forEach var="aBike" items="${sbikes}"> 
	<li>${aBike}</li>
</c:forEach>
</ul>
</body>
</html>