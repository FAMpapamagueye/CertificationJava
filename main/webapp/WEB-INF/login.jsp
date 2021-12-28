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
<body class="center">
	<h1 style="text-align: center">Vous pouvez vous inscrire sur ce Formulaire
			</h1>
			<br>
			<br>	

	<form method="post" action="login"  style="text-align: center;margin-left:500px;padding:10px" >

		
			
			<div class="row">
				<!-- Grid column -->
				<div class="col-md-6 mb-4">
					<div class="card">
						<div class="card-body">
							<h3 class="text-center default-text py-3">
								<i class="fa fa-lock"></i> Login:
							</h3>
							<!--Body-->
							<div class="md-form">
								<i class="fa fa-envelope prefix grey-text"></i> <input
									type="text" id="defaultForm-email" class="form-control" name="email">
								<label for="defaultForm-email"> email
									${connexion.erreurs['email']}</label>
							</div>
							<div class="md-form">
								<i class="fa fa-lock prefix grey-text"></i> <input
									type="password" id="defaultForm-pass" class="form-control" name="password">
								<label for="defaultForm-pass"> password
									${connexion.erreurs['password']}</label>
							</div>
							<div class="text-center">
								<button class="btn btn-default waves-effect waves-light"
									type="submit">connexion</button>
							</div>
						</div>
					</div>
				</div>
	</form>
</body>
</html>