<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="header.jsp"%>
<title>User Registration Form</title>

<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
	<h1>Welcome to our Organizations ...</h1>
	<br></div>
	<div align="center">
		<div class="container">
			<div class="row">
				<div class="col-6">
					<h2>Client Registration</h2>
					<h3>Personal Details</h3>

					<form:form action="save" method="post" modelAttribute="client">

						<div class="form-group ">
							<form:label path="name">Full name:</form:label>
							<form:input path="name" class="form-control" />

						</div>
						<div class="form-group ">
							<form:label path="email">E-mail:</form:label>
							<form:input path="email" class="form-control" />

						</div>
						<div class="form-group ">
							<form:label path="number">Phone Number:</form:label>
							<form:input path="number" class="form-control" />

						</div>
						<div class="form-group ">
							<form:label path="whatsAppNumber">WhatsApp Number(If Available)</form:label>
							<form:input path="whatsAppNumber" class="form-control" />

						</div>
						<div class="form-group ">
							<form:label path="gender">Gender:</form:label>
							<form:radiobutton path="gender" value="Male" />
							Male
							<form:radiobutton path="gender" value="Female" />
							Female<br />
							<form:radiobutton path="gender" value="Others" />
							Others<br />
						</div>
						<div class="form-group ">
							<form:label path="profession">Profession:</form:label>
							<form:select path="profession" items="${professionList}"
								class="form-control" />

						</div>
						<div class="form-group ">
							<form:label path="married">Married?</form:label>
							<form:checkbox path="married" />

						</div>
						<div class="form-group ">
							<form:label path="location">Location</form:label>
							<form:input path="location" class="form-control" />

						</div>
				</div>


				<!-- Professional Details -->
				<!-- Ending -->

				<div class="col-6">
					<br /> <br />
					<h3>Professional Details</h3>
					<div class="form-group ">
						<form:label path="skills">Skills</form:label>
						<form:input path="skills" class="form-control" />
					</div>
					<div class="form-group ">
						<form:label path="workHistory">Work History</form:label>
						<form:input path="workHistory" class="form-control" />

					</div>
					<div class="form-group ">
						<form:label path="education">Education</form:label>
						<form:input path="education" class="form-control" />

					</div>
					<div class="form-group ">
						<form:label path="socailLink">Social Link</form:label>
						<form:input path="socailLink" class="form-control" />

					</div>
					<div class="form-group ">
						<form:label path="experience">Total Experience</form:label>
						<form:input path="experience" class="form-control" />
					</div>

					<div class="form-group ">

						<form:label path="position">Position</form:label>
						<form:input path="position" class="form-control" />
						<h3>You can choose:</h3>
						<option>Software Developer</option>
						<option>Data Analyst</option>
						<option>Data Engineer</option>
						<option>Data Scientist</option>

					</div>
					<br /> <br /> 
					<div class="form-group center btn-btn-primary">
						<form:button>Submit</form:button>
					</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>