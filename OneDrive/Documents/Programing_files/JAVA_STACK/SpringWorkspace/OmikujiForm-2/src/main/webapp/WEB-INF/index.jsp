<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji!</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">



</head>
<body>
	<div class="container-md">
	<h2>Send an Omikuji!</h2>
   	<form action="/submit" method="post">
   		<p>
   			Pick any number from 5 to 25
   			<input type="number"   name="number"  class="form-control"  placeholder="Default input" aria-label="default input example"/>
   		</p>
   		<p>
   			Enter the name of any city.
   			<input type="text" name="city"  class="form-control"  placeholder="Default input" aria-label="default input example"/>
   		</p>
   		<p>
   			Enter the name of any real person.
   			<input type="text" name="person"  class="form-control"  placeholder="Default input" aria-label="default input example"  />
   		</p>
   		<p>
   			Enter Hobby
   			<input type="text" name="hobby"  class="form-control"  placeholder="Default input" aria-label="default input example"  />
   		</p>
   		<p>
   			Enter any living thing
   			<input type="text" name="living"  class="form-control"  placeholder="Default input" aria-label="default input example" />
   		</p>
   		<p>
   			Say Something nice to Someone. 
   			<input type="text" name="nice"  class="form-control"  placeholder="Default input" aria-label="default input example" />
   		</p>
   			<p>
   			Send and show a friend.
   			</p>
   			<p>
   			<button class="btn btn-success">Send</button>
   			</p>
   	</form>
	</div>

</body>
</html>