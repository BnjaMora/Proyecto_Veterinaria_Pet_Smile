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
		<h4>Datos Agenda</h4>
		<form action="agenda" method="POST">
			<div class="form-group">
				<label for="correo">Nombre Mascota:</label> <input type="text"
					class="form-control" id="nombreMascota" name="nombreMascota"
					required>
			</div>
			<div class="form-group">
				<label for="correo">Id Mascota:</label> <input type="text"
					class="form-control" id="idMascota" name="idMascota" required>
			</div>
			<div class="form-group">
				<label for="correo">Rut Dueño:</label> <input type="text"
					class="form-control" id="rutDueño" name="rutDueño" required>
			</div>
			<div class="form-group">
				<input type="time" class="form-control" id="hora" name="hora"
					required>
			</div>
			<div class="form-group">
				<input type="date" class="form-control" id="fecha" name="fecha"
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