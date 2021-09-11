package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import entidad.Mascota;

public class ModeloMascota {
	public void guardarMascota(Mascota mascota) throws SQLException {

		Connection cn = (Connection) Conexion.getConexion();

		String sql = "INSERT INTO mascota (idMascota, rutDueño, tipoMascota, edad, nombreMascota) VALUES (NULL, ?, ?, ?, ?)";

		PreparedStatement preparedStmt = cn.prepareStatement(sql);

		preparedStmt.setInt(1, mascota.getRutDueno());
		preparedStmt.setString(2, mascota.getTipoMascota());
		preparedStmt.setInt(3, mascota.getEdad());
		preparedStmt.setString(4, mascota.getNombreMascota());

		preparedStmt.execute();
		cn.close();

		System.out.println(mascota.toString());
	}
}
