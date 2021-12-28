<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body >

		<h1>Inscription</h1>
		<form action="register" method="post">
			<table style="text-align: center;" class="table">
				<thead>Vous pouvez vous inscrire sur ce Formulaire
				</thead>
				<br>
				<br>
				<tbody>
					<tr>
						<td>Nom</td>
						<td><input type="text" name="nom" value="${utilisateur.nom }"></td>
						<td><span style="color:red">${inscription.erreurs['nom']}</span></td>
					</tr>
					<td>Prenom</td>
					<td><input type="text" name="prenom" value="${utilisateur.prenom }"></td>
						<td><span style="color:red">${inscription.erreurs['prenom']}</span></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email" value="${utilisateur.email }"></td>
							<td><span style="color:red">${inscription.erreurs['email']}</span></td>
					</tr>

					<tr>
						<td>Profil</td>
						<td><select name="profil">
								<option value="admin"
								${utilisateur.profil }=='"admin"'? seleted :''
								>admin</option>
								<option value="clients"
								${utilisateur.profil }=='"clients"'?seleted :''
								>clients</option>
						</select></td>
							<td><span style="color:red">${inscription.erreurs['profil']}</span></td>
					</tr>
					<tr>
						<td>Mot de Passe</td>
						<td><input type="password" name="password"></td>
							<td><span style="color:red">${inscription.erreurs['pwd']}</span></td>
					</tr>
					<tr>
						<td>Confirmation Mot de Passe</td>
						<td><input type="password" name="conf"></td>
							<td><span style="color:red">${inscription.erreurs['pwd'] }</span></td>
					</tr>
					<tr>
						<td><input type="reset" value="Annuler"></td>
						<td><input type="submit" value="S'inscrire"></td>
					</tr>

				</tbody>
			</table>

	</form>
</body>
</html>