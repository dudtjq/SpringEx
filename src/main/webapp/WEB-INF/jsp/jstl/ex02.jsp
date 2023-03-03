<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="weight" value="99" />

	<h1>ex02 반복문</h1>
	
	<h2>if else</h2>
	<%-- 몸무게가 70이하면 치킨 몸무게가 80이하면 샐러드 그게 아니면 굶어 --%>
	<c:choose >
	<%-- if(weight <=70) --%>
		<c:when test="${weight <= 70 }">
			<h4>치킨</h4>
		</c:when>
		<%-- else if(weight <= 80) --%>
		<c:when test="${weight <= 80 }">
			<h4>샐러드</h4>
		</c:when>
		<%-- else --%>
		<c:otherwise>
			<h4>굶어</h4>
		</c:otherwise>
	</c:choose>
	
	
	<h2>반복문</h2>
		<%-- for(int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i }
	</c:forEach>
	
	<%-- for(String fruit:fruitList) --%>
	<c:forEach var="fruit" items="${fruitList}" varStatus="status">
	
		<h3>${fruit} :::: ${status.count } ${status.index} ${status.first } ${status.last } </h3>
	
	</c:forEach>	
	
	<c:forEach var="user" items="${userList}" varStatus="status">
	
		<h3>${user}</h3>
	
	</c:forEach>
		
</body>
</html>