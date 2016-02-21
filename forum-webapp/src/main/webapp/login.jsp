<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

	<form action="j_security_check" method=post>
		<p>	Email: <input type="text" name="j_username" /> </p>
		<p>	Password: <input type="password" name="j_password" /> </p>
		<p>	Email: <input type="submit" value="Login" /> </p>
	</form>

</body>
</html>