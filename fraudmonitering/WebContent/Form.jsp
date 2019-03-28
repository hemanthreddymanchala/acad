<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			Registration Form Dark	
		</title>
		<meta charset="UTF-8">
		
		<link rel="stylesheet" href="css/formstyle.css" media="screen" type="text/css" />
	</head>
	<body >
    <div class="container">
	<div id="login">
	<form action="SubmitForm.do" method="post">
	<fieldset class="clearfix">
	<table style="width:400px">
			
			<tr>
			<td >First Name:</td>
			<td><input type="text" name="firstname" id="firstname" value=""/><br><br></td>
			</tr>
			
			<tr>
			<td>Last Name:</td>
			<td><input type="text" name="lastname" id="lastname" value=""/><br><br></td>
			</tr>
			
			<tr>
			<td>Age:</td>
			<td><input type="text" name="age" id="age" value=""/><br><br></td>
			</tr>
			
			<tr>
			<td >Gender:</td>
			<td ><select name="gender" style="width:230px">
				<option value="none">Select your gender</option>
				<option value="Male">Male</option>
				<option value="Female">Female</option>
				</select><br><br></td>
			</tr>
			
			<tr>
			<td>Contact Number:</td>
			<td><input type="text" name="contactnumber" id="contactnumber" value=""/><br><br></td>
			</tr>
			
			<tr>
			<td>City:</td>
			<td><input type="text" name="city" id="city" value=""/><br><br></td>
			</tr>
			
			<tr>
			<td>State:</td>
			<td><input type="text" name="state" id="state" value=""/><br><br></td>
			</tr>
			
			
			<tr>
			<td>User Id:</td>
			<td><input type="text" name="userid" id="userid" value=""/><br><br></td>
			</tr>
			
			
			<tr>
			<td>Password:</td>
			<td><input type="password" name="password" id="password" value=""/><br><br></td>
			</tr>
		</table>
		<button type="submit" form="form" value="Submit" ><p>Submit</p></button>
		</fieldset>
		</form>
		</div>
		</div>
	</body>	
</html>