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
<form action="ExamClient.jsp">
 <div align="center">
 <form action="ExamClient.jsp">
        <h2>Registration Succeeded!</h2>
        <h3>Your details</h3>
        <span>Full name:</span><span>${client.name}</span><br/>
        <span>E-mail:</span><span>${client.email}</span><br/>
        <span>Phone Number:</span><span>${client.number}</span><br/>
        <span>WhatsApp Number:</span><span>${client.whatsAppNumber}</span><br/>
        <span>Gender:</span><span>${client.gender}</span><br/>
        <span>Profession:</span><span>${client.profession}</span><br/>
        <span>Married?:</span><span>${client.married}</span><br/>
        <span>location:</span><span>${client.location}</span><br/>
        <span>skills:</span><span>${client.skills}</span><br/>
        <span>workHistory:</span><span>${client.workHistory}</span><br/>
        <span>education:</span><span>${client.education}</span><br/>
        <span>socailLink:</span><span>${client.socailLink}</span><br/>
        <span>experience:</span><span>${client.experience}</span><br/>
        <span>position:</span><span>${client.position}</span><br/>
        <h4>We will get Back to you as soon as possible !</h4>
        <h4>Thank You!</h4>
         <h4>Give your Skill Test here....</h4>
          <a href="/ExamClient">
        <button>Skill Test</button></a>
        </form>
    </div>
    </form>
</body>
</html>