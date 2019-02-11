<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Weather Application</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
.table {
	width: 40%;
}
</style> 

</head>
<body>

<form id="weatherDetails" method="post">
		<strong>Please enter Latitude value</strong> 	:<input type="text" onkeypress="return isNumberKey(event)" id="latitude" name="latitude" value="50.85" /><br/>
		<strong>Please enter Longitude value: </strong>  <input type="text"onkeypress="return isNumberKey(event)" id="longitude"  name="longitude" value="4.35" /><br/>
		<input type="submit" /><br/>
	</form>
	     
	 <script src="js/weatherinfo.js"></script>  
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
</body>
</html>