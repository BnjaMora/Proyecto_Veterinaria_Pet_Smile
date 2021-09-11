package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Mascota;
import modelo.ModeloMascota;

@WebServlet("/mascota")
public class ServletMascota extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idMascota = 1;
		int rutDueno = Integer.parseInt(request.getParameter("rutDueno"));
		String tipoMascota = request.getParameter("tipoMascota");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String nombreMascota = request.getParameter("nombreMascota");

		Mascota eMascota = new Mascota(idMascota, rutDueno, edad, tipoMascota, nombreMascota);

		ModeloMascota mMascota = new ModeloMascota();
		// Prueba de errores
		try {
			mMascota.guardarMascota(eMascota);
			System.out.println("Imprime" + eMascota.toString());
			response.sendRedirect("RegistroAgenda.jsp");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al insertar \n");

			/*
			 * e.printStackTrace(); System.out.println("Error al insertar \n");
			 * System.out.println("CODIGO ERROR: " + e.getErrorCode());
			 * 
			 * if (e.getErrorCode() == MysqlErrorNumbers.ER_DUP_ENTRY) { mensaje = "El rut "
			 * + eDueno.getRut() + " ya se encuentra registrado!";
			 * System.out.println(mensaje); request.setAttribute("mensaje", mensaje);
			 * request.getRequestDispatcher("registro.jsp").forward(request, response); }
			 * System.out.println(e);
			 */
		}

	}

}
