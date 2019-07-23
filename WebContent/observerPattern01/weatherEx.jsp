<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="utf-8">
<title>WeatherEx</title>
</head>
<body>
	<h1>WeatherEx</h1>
	<hr>
	<form action="WeatherExServlet" method="post">
		<label>tommowWeather: </label> <input type="text" name="tommowWeather" />
		<br> <label>pressure: </label> <input type="text" name="pressure" />
		<br> <label>tempature: </label> <input type="text"
			name="tempature" /> <br> <label>hunuduty: </label> <input
			type="text" name="hunuduty" /> 
		<br> 
		<button id="addBroadCasting" type="button">add BroadCasting</button>
		<div class="addBroadCasting"></div>
		
		<br> <input type="submit"
			value="send">
	</form>
	
	
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#addBroadCasting").click(function() {
			var list = "<label>BroadCasting: </label><select name='broadCasting'><option value='KBS'>KBS</option><option value='MBC'>MBC</option><option value='SBS'>SBS</option></select>";
			$(".addBroadCasting").append(list);
		});

	});
</script>
</html>