<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> HI <c:out value="${name }"/></h1>
	<h1> Fruit Store</h1>
	<table>
		<td>
	<c:forEach var="oneFruit" items="${fruitsFromMyController}">
        <p><c:out value="${oneFruit}"></c:out></p>
    </c:forEach>
    	</td>
	</table>

</body>
</html>