<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- for rendering errors on PUT routes -->
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
    <title></title>
</head>
<body>
	<h1>Welcome to the </h1>
	
	<h2>Here are the dogs that are available:</h2>
	<table class="table table-striped">
		<thead class="table-dark">
			<tr scope="row">
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Hair Color</th>
				<th>Created At</th>
				<th>Update At</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dog" items="${ dogs }">
				<tr scope="row">
					<td><c:out value="${ dog.id }" /></td>
					<td><c:out value="${ dog.name }" /></td>
					<td><c:out value="${ dog.age }" /></td>
					<td><c:out value="${ dog.hairColor }" /></td>
					<td><fmt:formatDate type="date"  value="${ dog.createdAt }" /></td>
					<td>
						<c:choose>
							<c:when test="${ dog.updatedAt != null }">
								<fmt:formatDate type="date"  value="${ dog.updatedAt }" />
							</c:when>
							<c:otherwise>
								Dog has not be updated
							</c:otherwise>
						</c:choose>
					</td>
					<td>
						 <a href="/dogs/${ dog.id }" class="btn btn-primary">View</a>
						 <a href="/dogs/${ dog.id }/edit" class="btn btn-warning">Update</a>
						 <form action="/dogs/${ dog.id }/delete" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input type="submit" value="Delete" class="btn btn-danger">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/dogs/new" class="btn btn-success">Create a new Dog!</a>
</body>
</html>