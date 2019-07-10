<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
	<body>
		Welcome
		
		<div>
			<form:form method='GET' action='/master/signUpPage'>
				<input type='submit' value='Sign up'>
			</form:form>
		</div>
		
		<div>
			<form:form method='GET' action='/master/logInPage'>
				<input type='submit' value='Log in'>
			</form:form>
		</div>
		
	</body>
</html>