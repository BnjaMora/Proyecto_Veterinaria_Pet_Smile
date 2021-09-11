package controlador;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.cj.exceptions.MysqlErrorNumbers;

import entidad.Agenda;
import modelo.ModeloAgenda;

@WebServlet("/agenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = 1;
		int idMascota = Integer.parseInt(request.getParameter("idMascota"));
		int rutDueno = Integer.parseInt(request.getParameter("rutDueño"));
		String nombreMascota = request.getParameter("nombreMascota");
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String mensaje;

		Agenda eAgenda = new Agenda(id, idMascota, rutDueno, nombreMascota, fecha, hora);

		ModeloAgenda mAgenda = new ModeloAgenda();

		//Prueba de errores 
		try {
			mAgenda.guardarAgenda(eAgenda);
			System.out.println("Imprime" + eAgenda.toString());
			response.sendRedirect("index.jsp");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al insertar \n");
			System.out.println("CODIGO ERROR: " + e.getErrorCode());
			if (e.getErrorCode() == MysqlErrorNumbers.ER_NO_REFERENCED_ROW_2) {
				mensaje = "No existe una mascota con el id " + eAgenda.getId();
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("RegistroAgenda.jsp").forward(request, response);
			}

			if (e.getErrorCode() == MysqlErrorNumbers.ER_DUP_ENTRY) {
				mensaje = " <div class=\"alert alert-danger\" role=\"alert\"> La mascota con el id " + eAgenda.getId()
						+ " ya se encuentra registrada! </div>";
				System.out.println(mensaje);
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("RegistroAgenda.jsp").forward(request, response);
			}

		}

	}

}
