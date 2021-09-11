package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import entidad.Agenda;

public class ModeloAgenda {

	public void guardarAgenda(Agenda agenda) throws SQLException {

		Connection cn = (Connection) Conexion.getConexion();

		String sql = "INSERT INTO agenda(id, idMascota, rutDueño, nombreMascota, hora, fecha) VALUES (NULL, ? , ? , ? , ? , ?)";

		PreparedStatement preparedStmt = cn.prepareStatement(sql);

		preparedStmt.setInt(1, agenda.getIdMascota());
		preparedStmt.setInt(2, agenda.getRutDueno());
		preparedStmt.setString(3, agenda.getNombreMascota());
		preparedStmt.setString(4, agenda.getHora());
		preparedStmt.setString(5, agenda.getFecha());

		preparedStmt.execute();
		cn.close();

	}

}
