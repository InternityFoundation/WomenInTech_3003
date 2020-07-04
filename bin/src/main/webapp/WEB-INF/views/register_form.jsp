<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="header.jsp" %>
<title>User Registration Form</title>

<link rel="stylesheet" href="style.css">
</head>
<body>
<%@include file="navbar.jsp" %><br><br>
    <div align="center">
    <div class="container">
        <h2>Client Registration</h2>
        <h3>Personal Details</h3>
        
  		<div class="form-group">
  		 <form  action="save"  method="post">
        <!--<form:form action="register" method="post" modelAttribute="client">-->
            <form:label path="name">Full name:</form:label>
            <form:input path="name"/><br/>
            
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
             
            <form:label path="number">Phone Number:</form:label>
            <form:input path="number"/><br/>      
 
            <form:label path="whatsnumber">WhatsApp Number(If Available)</form:label>
            <form:input path="whatsnumber"/><br/>
             
            <form:label path="gender">Gender:</form:label>
            <form:radiobutton path="gender" value="Male"/>Male
            <form:radiobutton path="gender" value="Female"/>Female<br/>
            <form:radiobutton path="gender" value="Others"/>Others<br/>
             
            <form:label path="profession">Profession:</form:label>
            <form:select path="profession" items="${professionList}" /><br/>
                     
            <form:label path="married">Married?</form:label>
            <form:checkbox path="married"/><br/>
             
            <form:label path="Location">Location</form:label>
            <form:input path="Location" /><br/>
                 
            <form:button>Submit</form:button>
        </form:form>
        </div>
        </div>
    </div>
</body>
</html>