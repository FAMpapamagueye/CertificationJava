<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>suppression</title>
</head>
<body>
<fam:import url="/admin/menu.jsp"></fam:import>
<br><br>
<div style="margin-left:300px;margin-right:300px">
<ul class="list-group">
  <li class="list-group-item"><span>${menu.prix }</span></li>
  <li class="list-group-item">${menu.jourDate }</li>
  <li class="list-group-item">${menu.nom }</li>
  <li class="list-group-item"><a href="<fam:url value="confirm">
<fam:param name="nom" value="${menu.nom}" />
</fam:url>">Confirmer</a></li>

</ul>



</div>
</body>
</html>