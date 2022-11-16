<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) --> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- Functions --> 
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body style="margin: 10vw;">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>Expense Details</h1><a href="/expenses/">Go back</a>
<table>
	<tr>
	<td>Expense name:</td>
	<td><c:out value="${expense.name}"></c:out></td>
	</tr>
	<tr>
	
	<td>Expense Description:</td>
	<td><c:out value="${expense.description}"></c:out></td>
	
	</tr>
	
	<tr>
	
	<td>Expense vendor:</td>
	<td><c:out value="${expense.vendor}"></c:out></td>
	
	</tr>
	
	<tr>
			<td>Amount Spent:</td>
			<td><c:out value="${String.format('%, .2f' , expense.amount) }"></c:out></td>
	</tr>
	
</table>
</div>



</body>
</html>