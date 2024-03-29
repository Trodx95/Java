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
    <meta charset="UTF-8">
    <title></title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body style="margin: 10vw;">
<h1>Save Travels</h1>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">Expense</th>
            <th class="text-center">Vendor</th>
            <th class="text-center">Amount</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td class="text-center"><a href="/show/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
				<td class="text-center"><c:out value="${expense.vendor}"></c:out></td>
				<td class="text-center">$<c:out value="${expense.amount}"></c:out></td>
				<td class="text-center"><a href="/edit/${expense.id}">edit</a></td>
				<td class="text-center"><form action="/delete/${expense.id}" method="post">
    			<input type="hidden" name="_method" value="delete">
   				 <input type="submit" value="Delete"></form></td>
					
			</tr>	
		</c:forEach>
    </tbody>
</table>
<br>
<div>
	<h1>Add an expense:</h1>

	<form:form action="/expenses" method="post" modelAttribute="expense">
	<div>
		<form:label path="name">Expense Name: </form:label><br />
		<form:errors path="name" class="text-danger"/>
		<form:input style="width:250px;" path="name"/>
	</div>

	<div>
		<form:label path="vendor">Vendor: </form:label><br />
		<form:errors path="vendor" class="text-danger"/>
		<form:input style="width:250px;" path="vendor"/>
	</div>
	
	<div>
		<form:label path="amount">Amount: </form:label><br />
		<form:errors path="amount" class="text-danger"/>
		<form:input style="width:250px;" type="double" path="amount"/>
	</div>
	
	<div>
		<form:label path="description">Description: </form:label><br />
		<form:errors path="description" class="text-danger"/>
		<form:textarea style="width:250px;" rows="3" path="description"/>
	</div>
	
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</div>
</body>
</html>
	
	
