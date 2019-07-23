<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>StarbuckEx</title>
</head>
<body>
	<div class="container">
		<div align="center">
			<h1>StarbuckEx</h1>
			<hr>
			<div class="alert alert-dark" role="alert">
				<b>Starbuck Menu</b> <br>
			</div>
		</div>
		<table class="table">
			<tr class="thead-dark">
				<th><b>Coffee</b></th>
				<th><b>Topping</b></th>
			</tr>
			<tr>
				<td>HouseBlend - $0.89</td>
				<td>Soy - $0.15</td>
			</tr>
			<tr>
				<td>Espresso - $1.99</td>
				<td>Whip - $0.1</td>
			</tr>
			<tr>
				<td>DarkRoast - $0.99</td>
				<td>Mocha - $0.2</td>
			</tr>
		</table>
		<hr>
		<div class="alert alert-info" role="alert">
			<h4>Order</h4>
		</div>
		<form action="StarbuckServlet" method="post">
			<label>COFFEE: </label> <select name="coffeeMenu">
				<option value="HouseBlend">HouseBlend</option>
				<option value="Espresso">Espresso</option>
				<option value="DarkRoast">DarkRoast</option>
			</select> <br> <label>TOPPING: </label>
			<button id="addTopping" type="button">add Topping</button>
			<div class="addTopping"></div>
			<br> <br> <input type="submit" class="btn btn-secondary" value="order">
		</form>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#addTopping").click(function() {
			var list = "<label>ToppingMenu: </label> <select name='ToppingMenues'><option value='Soy'>Soy</option><option value='Whip'>Whip</option><option value='Mocha'>Mocha</option></select>";
			$(".addTopping").append(list);	
		});
		
	});

</script>
</html>