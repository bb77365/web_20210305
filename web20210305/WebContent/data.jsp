<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Page</title>
</head>
<body>
	<UL>
		<c:forEach var="word" items="${data}">
			<LI><c:out value="${word}" />
		</c:forEach>
	</UL>
</body>
</html>