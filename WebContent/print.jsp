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
<title>Print Result</title>
</head>
<body>
	<div class="container">
		<h1>Print Result</h1>
		<hr>
		<div class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text">Result</span>
			</div>
			<textarea class="form-control" aria-label="With textarea" rows="10" cols="10" aria-describedby="inputGroup-sizing-lg" >${message}</textarea>
		</div>
		<br>
		<button type="button" class="btn btn-info" onclick = "location.href = 'javascript:history.back()' ">Back</button>
		
	</div>
	
</body>
</html>