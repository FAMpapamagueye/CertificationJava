<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil Admin</title>

</head>
<body>

	<fam:import url="/admin/menu.jsp"></fam:import>
<br>
<br>
<br>
	<table style="text-align: center;" class="table table-secondary">
		<thead>
			<th>prix</th>
			<th>date</th>
			<th>nom</th>
	
			<th>Action</th>

		</thead>
		<tbody>
			<fam:forEach items="${menuMap }" var="per">
				<tr>
					<td><fam:out value="${per.value.prix }"></fam:out></td>
					<td>${per.value.jourDate}</td>
					<td>${per.value.nom}</td>
					<td><a  class="btn btn-warning" href="<fam:url value="update">"><fam:param
								name="nom" value="${per.key}" />
							</fam:url>"> editer</a> &nbsp; <a   class="btn btn-danger" href="<fam:url value="supprimer">"><fam:param
								name="nom" value="${per.key}" />
							</fam:url>"> Supprimer</a></td>
				</tr>
			</fam:forEach>
		</tbody>
</body>
</html>