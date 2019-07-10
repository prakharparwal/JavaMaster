<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	<title>Log in</title>
	</head>
	<body>
		<h3>Log in</h3>
		
		<div>
			<form:form method='POST' action='/master/logIn' modelAttribute='person' >
				<div>
					<form:label path='username'>Username</form:label>
					<form:input path='username' />
				</div>
				<div>
					<form:label path='password'>Password</form:label>
					<form:input path='password' />
				</div>
				<div>
					<input type='submit' value='Log in' />
				</div>
			</form:form>
		</div>
		
	</body>
</html>