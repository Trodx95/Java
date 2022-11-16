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
<title>New Ninja</title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/style.css"/>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
</head>
<body>
   <div class="row justify-content-center mt-4">
            <div class="col-3">
                <div class="row">
                    <div class="col-8">
                        <h2>New Ninja</h2>
                    </div>
                </div>
                <form:form class="rounded border border border-success btn-sm" action="/ninjas" method="post" modelAttribute="ninja">
                    <div class="row justify-content-center">
                        <div class="col-9">
                            <form:label for="dojo" path="dojo" class="form-label mt-3">Dojo:</form:label>
                            <form:select class="form-select" path="dojo">
                                <c:forEach var="oneDojo" items="${dojos}">
                                 <form:option value="${oneDojo.id}" path="dojo">
                                    <c:out value="${oneDojo.name}" />
                                    </form:option>
                                </c:forEach>
                            </form:select>
                            <form:label for="firstName" path="firstName" class="form-label mt-3">First Name:</form:label>
                            <form:errors path="firstName" cssClass="text-danger" />
                            <form:input type="text" class="form-control mb-3" id="firstName" path="firstName" aria-label="Ninja's first name" />
                            <form:label for="lastName" path="lastName" class="form-label">Last Name:</form:label>
                            <form:errors path="lastName" cssClass="text-danger" />
                            <form:input type="text" class="form-control mb-3" id="lastName" path="lastName" aria-label="Ninja's last name"/>
                            <form:label for="age" path="age" class="form-label">Age:</form:label>
                            <form:errors path="age" cssClass="text-danger" />
                            <form:input type="text" class="form-control mb-3" id="age" path="age" value="1" aria-label="Ninja's age"/>
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
                                      
