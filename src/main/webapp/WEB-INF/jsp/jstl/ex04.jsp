<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04 functions </title>
</head>
<body>

	<h1>JSTL 함수 라이브러리</h1>

	<c:set var="string1" value="No pain, No gain" />
	
	<h3>문자열 길이 구하기</h3>
	<%-- 길이 : 16 출력 --%>
	<h4>길이 : ${fn:length(string1)}</h4>

	<h3>특정 문자열이 존재하는지 여부 확인</h3>
	<%-- No가 존재 하는가? true 출력 --%>
	<h4>No가 존재 하는가? ${fn:contains(string1, "No")}  </h4>
	<%-- Yes가 존재 하는가? false 출력 --%>
	<h4>Yes가 존재 하는가? ${fn:contains(string1, "Yes")}  </h4>
	
	<%-- 조건문 활용! --%>
	<c:if test="${fn:contains(string1, 'pain') }">
		<%-- ain이 존재한다 --%>
		<h4>pain이 존재한다</h4>
	
	</c:if>
	
	<h3>특정문자열로 시작, 끝나는지</h3>	
	
	<h4>No 로 시작하는지 ${fn:startsWith(string1, "No") }</h4>
	<h4>gain 로 끝나는지 ${fn:endsWith(string1, "gain") }</h4>
	
	<c:set var="string2" value="I Love chicken" />
	
	<h3>문자열 치환</h3>
	<%--  Love bread --%>	
	<h4>${fn:replace(string2, "chicken", "bread")}</h4>	
	<%-- e chicken --%>
	<h4>${string2 }</h4>
	
	<h3>문자열 자르기</h3>
	<%-- Love --%>
	<h4>${fn:substring(string2, 2, 6) }</h4>
	
	<h3>문자열 쪼개기</h3>
	<%-- Love --%>
	<h4>${fn:split(string2, " ")[1] }</h4>
	
	<h3>문자열 앞뒤 공백 제거</h3>
		
	<c:set var="string3" value="           hello    " />
	<%--            hello     --%>
	<pre>${string3 }</pre>	
	<%-- hello --%>
	<pre>${fn:trim(string3) }</pre>
	
	
</body>
</html>