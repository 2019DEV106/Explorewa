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
	 
	 
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script>
$("#weatherDetails").submit(function() {
	  var latitudeVal = $("#latitude").val();
	  var longitudeVal = $("#longitude").val();
	  if(latitudeVal == "") {
	    alert('Fill this latitude field');
	    return false;
	  }
	  if(longitudeVal == "") {
		    alert('Fill this longitude field');
		    return false;
		  }
	});
	
function isNumberKey(evt)
{
   var charCode = (evt.which) ? evt.which : event.keyCode
   if (charCode != 46 && charCode > 31 && (charCode < 48 || charCode > 57)){
	   alert("Number and decimal only allowed"); 
	   return false;
   }
   return true;
}

</script>	
</body>
</html>