<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Formatting</title>
</head>
<body>

	<h1>JSTL 포멧 라이브러리</h1>
	
	<%-- 1,234,567,890 출력됨 --%>
	<c:set var="number" value="1234567890" />
	<h3>숫자</h3>
	<h4><fmt:formatNumber value="${number }" /> </h4>
	
	<h3>percent</h3>
	<%-- 35% 출력됨 --%>
	<h4><fmt:formatNumber value="0.35" type="percent" /></h4>
	<%-- 60% 출력됨 --%>
	<h4><fmt:formatNumber value="${3 / 5 }" type="percent" /></h4>
	
	<h3>통화</h3>
	<%-- ₩1,234,567,890 출력됨 --%>
	<h4><fmt:formatNumber value="${number }" type="currency" /> </h4>
	<%-- $1,234,567,890 출력됨 --%>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" /> </h4>
	<fmt:formatNumber value="${number }" type="currency" var="won" />
	<%-- 1,234,567,890 출력됨 --%>
	<h4>${won }</h4>
	
	<h3>숫자 소수점 패턴</h3>
	<c:set var="pi" value="3.1415926535" />
	
	<h4>${pi }</h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.00" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.################" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.0000000000000000" /> </h4>
	
	<hr>
	
	<h3>날짜 출력</h3>
	
	<h4>${today }</h4>
	<h4><fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" /></h4>
	
	<%-- 2023/03/03 12:11:18 --%>
	<%-- 2023-03-03 12:11:18 --%>
	<%-- String -> Date -> String --%>
	
	<fmt:parseDate value="${dateString }" pattern="yyyy/MM/dd HH:mm:ss" var="date" />
	<h4>${date }</h4>
</body>
</html>
