<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FrontControllServlet?login" method="post">
 <div class="textbox">
			<input type="text" name="userName" required="required" placeholder="username"  value="">
	</div>
	<div class="textbox">
		<input type="password" name="password" required="required" placeholder="password"  value="">
	</div>

<input class="btn" type="submit" name="Submit" value="Login">
</form>
</body>
</html>