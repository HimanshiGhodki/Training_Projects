<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FrontControllServlet?registration" method="post">

<h1>Registration Page</h1>

  <div class="input-container">
    <input type="text" name="empId" required="required" placeholder="empId"  value="" title="Enter emp id here">
  </div>
<br>
<div class="input-container">
    <input type="text" name="firstName" required="required" placeholder="firstName"  value="" title="Enter first name here">
  </div>
<br>
<div class="input-container">
   <input type="text" name="lastName" required="required" placeholder="lastName"  value="" title="Enter last name here">
  </div>
<br>
  <div class="input-container">
    <input type="text" name="empSalary" required="required" placeholder="empSalary"  value="" title="Enter salary here"> 
  </div>
<br>
  <div class="input-container">
    <input type="text" name="empDesignation" required="required" placeholder="empDesignation"  value="" title="Enter designation here">
  </div>
<br>
<input class="btn" type="submit" name="Submit" value="Submit">
</form>


</body>
</html>