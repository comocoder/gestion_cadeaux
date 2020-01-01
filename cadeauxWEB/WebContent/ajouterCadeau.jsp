<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="assets/css/styles.css">

	<title>Gestion des cadeaux</title>
</head>
<body>
		<aside>
				<h1 id="title">gestion des cadeaux</h1>
				<nav>
					<ul>
						<li><a href="clients.jsp">Vos clients</a></li>
						<li><a href="ajouterClient.jsp">Ajouter un client</a></li>
						<li><a href="cadeaux.jsp">Les cadeaux</a></li>
						<li><a href="ajouterCadeau.jsp">Ajouter un cadeau</a></li>
						<li><a href="#">Vos fournisseurs</a></li>
						<li><a href="#">Etablir une commande</a></li>
						<li><a href="#">Commandes</a></li>
					</ul>
				</nav>
				</aside>
	<div class="right">

		<main>
			<div class="head-foot-form">
				<h2>Ajout d'un cadeau</h2>
			</div>
			<form action="CadeauControleur">
				<label for="nom">Nom du cadeau</label>
				<input type="text" name="cadeau" id="nom">
				<label for="fournisseur">Nom du fournisseur</label>
				<input type="text" name="fournisseur" id="fournisseur">
				<label for="telephone">Telephone</label>
				<input type="text" name="tel_fournisseur" id="telephone">
					<input type="submit" name="bt" value="Ajouter">
			</form>
		</main>
		<footer>
			<p>Code with &hearts; by <a href="">@comocoder</a></p>
		</footer>
	</div>
</body>
</html>