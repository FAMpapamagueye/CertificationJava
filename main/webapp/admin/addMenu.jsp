<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addmenu</title>

</head>
<body>
	<fam:import url="/admin/menu.jsp"></fam:import>
	<br><br>

	<form method="post" action="addmenu" style="margin-left:250px;margin-right:250px";>
		<table class="table"> 
			<tr>
				<td><label>Prix</label></td>
				<td><input type="number" name="prix" value=${menu.prix }></td>
				<td></td>
			</tr>
			<tr>
				<td><label>Date jour</label></td>
				<td><input type="date" name="date" value=${menu.jourDate }></td>
				<td></td>
			</tr>
			<tr>
				<td><label>Nom du Plats</label></td>
				<td><input type="text" name="nom" value=${menu.nom }></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="reset" value="Annuler"></td>
				<td><input type="submit" value="S'inscrire"></td>
			</tr>
		</table>
	</form>
</body>
</html>