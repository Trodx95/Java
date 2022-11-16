<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Omikuji !</title>
</head>
<body>
	<h1>Here's your Omikuji</h1>
	<div class="textContainer">
	<p>
	In <c:out value="${number}"/> years, you will live in<c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, selling<c:out value="${hobby}"/> for a living. The next time
	you see a<c:out value="${living}"/>, you will have good luck. Also, ${nice}.
	</p>
	<p>
   	<a href="/" class="button">Go Back</a>
   	</p>
   			
	
	
	
	
	</div>
	
</body>
</html>