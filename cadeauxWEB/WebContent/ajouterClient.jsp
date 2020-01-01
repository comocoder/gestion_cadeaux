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
	<title>Gestion de cadeau</title>
</head>
<body>
		<aside>
				<h1 id="title">gestion des cadeaux</h1>
				<nav>
					<ul>
						<li><a href="clients.jsp">Vos clients</a></li>
						<li><a href="#">Ajouter un client</a></li>
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
				<h2>Ajout d'un client</h2>
			</div>
			<form action="ClientControleur">
				<label for="nom">Nom</label>
				<input type="text" name="nom" id="nom">
				<label for="prenom">Prenom</label>
				<input type="text" name="prenom" id="prenom">
				<label for="telephone">Telephone</label>
				<input type="text" name="tel" id="telephone">
				<label for="rue">Rue</label>
				<input type="text" name="rue" id="rue">
				<label for="ville">Ville</label>
				<input type="text" name="ville" id="ville">
				<label for="code_postale">Code postable</label>
				<input type="text" name="cp" id="code_postale">
					<input type="submit" name="bt" value="Ajouter">
			</form>
		</main>
		<footer>
			<p>Code with &hearts; by <a href="">@comocoder</a></p>
		</footer>
	</div>
</body>
</html>