<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="" %>  
-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>
</head>
<body>
<form:form modelAttribute="form">
   <form:errors path="" element="div" />
   <h2 style="color:blue">PRODUCT REGISTRATION</h2>
   <div>
   		<form:label path="prdName">Product ID</form:label>
   			<form:input path="prdName"/>
   		<form:errors path="prdName"/>
   </div>
   
   <div>
   		<form:label path="prdPrice">Product ID</form:label>
   			<form:input path="prdPrice"/>
   		<form:errors path="prdPrice"/>
   </div> 

	<div>
		<input type="submit"/>
	</div>
</form:form>
</body>
</html>