<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>total cost</title>
</head>
<body>
	<center>
		<h1 style='color: blue;'>GET TOTAL COST</h1>
		<h3 style='color: green;'>${msg}</h3> 
		<form  method="get" action="gettotalcost">
		<table>
			<tr>
				<th>Company Name</th>
				<td><input type="text" name="comapnyName" /></td>
			</tr>
			<tr>
				<th>Quantity</th>
				<td><input type="text" name="quantity" /></td>
			</tr>
			<tr>
			    <th></th>
				<td><input type="submit" value="GETCOST" /></td>
			</tr>
		</table>
		</form>
	</center>
</body>
</html>