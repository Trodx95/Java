<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<table class="table table-dark table-striped-columns">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Price</th>
      
    </tr>
  </thead>
  <tbody>
    
      <c:forEach var="fruit" items="${fruits}">
      <tr> 
			<td><c:out value="${fruit.name}"></c:out></td>
			<td><c:out value="${fruit.price}"></c:out></td>      
      </tr>
    	
    
		</c:forEach>
    
    
    
  </tbody>
</table>





</body>

</html>