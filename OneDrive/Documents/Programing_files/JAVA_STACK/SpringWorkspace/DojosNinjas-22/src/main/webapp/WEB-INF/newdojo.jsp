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
<meta charset="ISO-8859-1">
<title>New Dojo</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="row justify-content-center mt-5">
            <div class="col-3">
                <div class="row">
                    <div class="col-8">
                        <h2>New Dojo</h2>
                    </div>
                </div>
                <form:form class="rounded border border border-success  btn-sm" action="/dojos" method="post" modelAttribute="dojo">
                    <div class="row justify-content-center">
                        <div class="col-9">
                            <form:label for="name" path="name" class="form-label mt-3">Name:</form:label>
                            <form:errors path="name" cssClass="text-danger" />
                            <form:input type="text" class="form-control mb-3" id="name" path="name" aria-label="Dojo's name" />
                            <div class="d-flex justify-content-end">
                                <input type="submit" class="btn btn-dark" value="Create"/>
                            </div>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>

</body>
</html>