<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio de Sesión</title>
<!--Link Estilos Bootstrap-->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

<style>
.titulo {
	text-align: center;
	margin-top: 60px;
}

.login_center {
	display: flex;
	align-items: center;
	justify-content: center;
	min-height: 100vh;
	margin-top: -180px;
}

.formulario {
	width: 450px;
	margin-top: 250px;
}

.boton_login {
	align-items: center;
	justify-content: center;
	display: flex;
}

.ingresar {
	margin: 20px;
}

.alerta{
  align-items: center;
  display: flex;
  justify-content: center;
}
</style>

<body>
	<div class="contenedor">
		<h3 class="titulo">Veterinaria Pet Smile</h3>
		<div class="login_center">
			<form class="formulario" action="usuario" method="POST">
				<div class="form-group row col-md-15">
					<label for="usuario" class="col-sm-2 col-form-label">Usuario</label>
					<div class="col-sm-12">
						<input type="text" class="form-control" id="nombre_usuario"
							name="nombreUsuario" required>
					</div>
				</div>
				<div class="form-group row col-md-15">
					<label for="password" class="col-sm-2 col-form-label">Password</label>
					<div class="col-sm-12">
						<input type="password" class="form-control" id="password"
							name="password" required>
					</div>
				</div>
				<div class="boton_login">
					<button type="submit" class=" ingresar btn btn-primary">Ingresar</button>
				</div>
				
				<!-- Contenedor Alerta -->
				<div class="alerta">
					<p>
						<%
						String resultado = (String) request.getAttribute("mensaje");
						String mensaje = "";
						if (resultado != null) {
							mensaje = resultado;
						}
						%>
						<%=mensaje%>
					</p>
				</div>
			</form>
			
		</div>
	</div>
</body>
</html>