<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head></head>
	<body>
		Welcome!!
		
		<form:form  method='post' action='submitForm' modelAttribute="person">
			<form:input path='id'/> <form:errors path='id'/>
			<form:input path='name'/> <form:errors path='name'/>
			<input type='submit' value='submit'>		
		</form:form>
		
	</body>
</html>