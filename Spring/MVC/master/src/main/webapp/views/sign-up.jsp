<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	<title>Sign up</title>
	</head>
	<body>
		<h3>Sign up</h3>
		
		<div>
			<form:form method='POST' action='/master/signUp' modelAttribute='person'>
				<div>
					<form:label path='name'>Name</form:label> 
					<form:input path='name' />
					<form:errors path="name" cssClass="error"/>  
				</div>
				<div>
					<form:label path='username'>Username</form:label>
					<form:input path='username'/>
				</div>
				<div>
					<form:label path='password'>Password</form:label>
					<form:input path='password'/>					
				</div>
				<div>
					<form:label path='age'>Age</form:label>
					<form:input path='age'/>
					<form:errors path="age" cssClass="error"/>  
				</div>
				<div>
					<input type='submit' value='Submit'/>
				</div>				
				
			</form:form>
		</div>
		
	</body>
</html>