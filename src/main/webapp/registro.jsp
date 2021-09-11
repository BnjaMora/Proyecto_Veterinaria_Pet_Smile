<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--Link Estilos Bootstrap-->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

<style>
.container {
	margin-top: 60px;
}

.guardar {
	margin: 20px;
}

h4 {
	margin-top: 30px;
}

</style>

<body>

	<div class="container">
		<h2>Registrar Reserva</h2>
		<h4>Datos Dueño</h4>
		<form action="dueno" method="POST">
			<div class="form-group">
				<label for="nombre">Nombre Dueño:</label> <input type="text"
					class="form-control" id="nombre" name="nombre" required>
			</div>
			<div class="form-group">
				<label for="password">Apellido:</label> <input type="text"
					class="form-control" id="apellido" name="apellido" required>
			</div>
			<div class="form-group">
				<label for="password">Rut:</label> <input type="number"
					class="form-control" id="rut" name="rut" required>
			</div>
			<div class="form-group">
				<label for="correo">dirección:</label> <input type="text"
					class="form-control" id="direccion" name="direccion" required>
			</div>
			<div class="form-group">
				<label for="correo">Correo:</label> <input type="text"
					class="form-control" id="correo" name="correo" required>
			</div>
			<div class="form-group">
				<label for="correo">Teléfono:</label> <input type="text"
					class="form-control" id="telefono" name="telefono" required>
			</div>
			<div class="form-group">
				<label for="correo">Nombre Mascota:</label> <input type="text"
					class="form-control" id="nombreMascota" name="nombreMascota"
					required>
			</div>
			
			<button type="submit" class=" guardar btn btn-primary">Guardar</button>
		</form>
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
	</div>

</body>
</html>