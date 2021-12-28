<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>commandez</title>
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
<body>
<h1 style="text-align: center;">Faites vos commande SVP</h1>
<table style="text-align: center;" class="table table-secondary">
		<thead>
			<th>prix</th>
			<th>date</th>
			<th>nom</th>
	
			<th>Action</th>

		</thead>
		<tbody>
			<fam:forEach items="${menuMap}" var="per">
				<tr>
					<td><fam:out value="${per.value.prix }"></fam:out></td>
					<td>${per.value.jourDate}</td>
					<td>${per.value.nom}</td>
					<td><a  class="btn btn-dark" href="<fam:url value="commande">"><fam:param
								name="nom" value="${per.key}" />
							</fam:url>"> commandez</a> &nbsp;
				</tr>
			</fam:forEach>
		</tbody>
</body>
</html>