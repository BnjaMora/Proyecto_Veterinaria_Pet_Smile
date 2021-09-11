package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidad.Dueno;
import conexion.Conexion;

public class ModeloDueno {

	public void guardarDueno(Dueno dueno) throws SQLException {
		
			Connection cn = (Connection) Conexion.getConexion();

			String sql = "INSERT INTO dueño(rut, nombre, apellido, direccion, correo, telefono, nombreMascota) VALUES (?,?,?,?,?,?,?)";

			PreparedStatement preparedStmt = cn.prepareStatement(sql);
						
			preparedStmt.setInt(1,dueno.getRut());
			preparedStmt.setString(2,dueno.getNombre());
			preparedStmt.setString(3,dueno.getApellido());
			preparedStmt.setString(4,dueno.getDireccion());
			preparedStmt.setString(5,dueno.getCorreo());
			preparedStmt.setString(6,dueno.getTelefono());
			preparedStmt.setString(7,dueno.getNombreMascota());

			preparedStmt.execute();
			cn.close();
			
			
		

	}
}
