<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="header.jsp" %>
<link rel="stylesheet" href="style.css">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
<%@include file="navbar.jsp" %><br><br>
    <div align="center">
        <h2>Registration Succeeded!</h2>
        <h3>Your details</h3>
        <span>Full name:</span><span>${client.name}</span><br/>
        <span>E-mail:</span><span>${client.email}</span><br/>
        <span>Phone Number:</span><span>${client.number}</span><br/>
        <span>WhatsApp Number:</span><span>${client.whatsnumber}</span><br/>
        <span>Gender:</span><span>${client.gender}</span><br/>
        <span>Profession:</span><span>${client.profession}</span><br/>
        <span>Married?:</span><span>${client.married}</span><br/>
        <span>location:</span><span>${client.location}</span><br/>
        <h4>We will get Back to you as soon as possible !</h4>
        <h4>Thank You!</h4>
    </div>
</body>
</html>