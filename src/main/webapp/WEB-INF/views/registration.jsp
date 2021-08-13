<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Here</title>
<link href='<c:url value="/resources/css/bootstrap.min.css"/>' rel="stylesheet">

</head>
<body>
<div class="container">

<div class="form-container">

<form:form action="saveAccount" cssClass="form-hrozontal" method="post" modelAttribute="newAccount">

 <div class="form-group">
 <label for="fname" class="col-md-3 control-label">Firstname</label>
 <form:input path="fname" cssClass="form-control"/>

 </div>
 <div class="form-group">
 <label for="lname" class="col-md-3 control-label">Lastname</label>
 <form:input path="lname" cssClass="form-control"/>

 </div>
 
 <div class="form-group">
 <label for="email" class="col-md-3 control-label">email</label>
 <form:input path="email" cssClass="form-control"/>

 </div>
 
 <div class="form-group">
 <label for="username" class="col-md-3 control-label">username</label>
 <form:input path="username" cssClass="form-control"/>
 </div>
 
 <div class="form-group">
 <label for="password" class="col-md-3 control-label">password</label>
 <form:input path="password" cssClass="form-control"/>
 </div>
 
  <div class="form-group">
  <form:button cssClass="btn btn-primary">Submit</form:button>
 </div>


</form:form>

</div>



</div>


</body>
</html>