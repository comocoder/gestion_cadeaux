<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion des cadeaux</title>
</head>
<body>
	<form action="ClientController">
		<label> Nom </label>
		<input type="text" name="nom" ><br><br>
		<label> Prenom </label>
		<input type="text" name="prenom" ><br><br>
		<label> N° Tel </label>
		<input type="text" name="tel"><br><br>
		<label> Rue </label>
		<input type="text" name="rue"><br><br>
		<label> Code postable </label>
		<input type="text" name="cp"><br><br>
		<label> Ville </label>
		<input type="text" name="ville"><br><br>
		
		<input type="submit" name="bt" value="Ajouter">
	</form>
</body>
</html>