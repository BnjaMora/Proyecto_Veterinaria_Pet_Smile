package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.exceptions.MysqlErrorNumbers;

import entidad.Dueno;
import modelo.ModeloDueno;

@WebServlet("/dueno")
public class ServletDueno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int rut = Integer.parseInt(request.getParameter("rut"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String direccion = request.getParameter("direccion");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String nombreMascota = request.getParameter("nombreMascota");

		Dueno eDueno = new Dueno(rut, nombre, apellido, direccion, correo, telefono, nombreMascota);

		ModeloDueno mDueno = new ModeloDueno();
		String mensaje;
		
		//Prueba de errores 
		try {
			mDueno.guardarDueno(eDueno);
			System.out.println("Imprime" + eDueno.toString());
			response.sendRedirect("RegistroMascota.jsp");

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Error al insertar \n");
			System.out.println("CODIGO ERROR: " + e.getErrorCode());

			if (e.getErrorCode() == MysqlErrorNumbers.ER_DUP_ENTRY) {
				mensaje = " <div class=\\\"alert alert-danger\\\" role=\\\"alert\\\"> El rut " + eDueno.getRut() + " ya se encuentra registrado! </div>";
				System.out.println(mensaje);
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			}
			System.out.println(e);
		}

	}
}
