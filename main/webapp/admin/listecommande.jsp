<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">Liste Des commandes</h1>
<table style="text-align: center;" class="table table-secondary">
		<thead>
			<th>prenom</th>
			<th>nom</th>
			<th>commande</th>
			
	
			<th>Action</th>

		</thead>
		<tbody>
			<fam:forEach items="${ListeMap}" var="per">
				<tr>
					<td><fam:out value="${per.value.user }"></fam:out></td>
					<td><fam:out value="${per.value.user}"></fam:out></td>
					<td><fam:out value="${per.value.commande}"></fam:out></td>
					
				
				</tr>
			</fam:forEach>
		</tbody>
</body>
</html>