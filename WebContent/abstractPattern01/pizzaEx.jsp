<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PizzaEx</title>
</head>
<body>
	<h1>pizzaEx</h1>
	<hr>
	<form action="PizzaExServlet01" method="post">
		<label>pizzaMenu: </label>
		<select name ="menu">
			<option value ="cheese">cheese</option>
			<option value ="pepperoni">pepperoni</option>
			<option value ="chicken">chicken</option>
			<option value ="chicken">seafood</option>
			<option value ="veggie">veggie</option>
		</select>
		<br><br>
		<input type="submit" value="order">
	</form>
	
</body>
</html>