package entidad;

public class Agenda {

	private int id, idMascota, rutDueno;
	private String nombreMascota, fecha, hora;

	public Agenda() {

	}

	public Agenda(int id, int idMascota, int rutDueno, String nombreMascota, String fecha, String hora) {
		super();
		this.id = id;
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.nombreMascota = nombreMascota;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public int getRutDueno() {
		return rutDueno;
	}

	public void setRutDueno(int rutDueno) {
		this.rutDueno = rutDueno;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Agenda [id=" + id + ", idMascota=" + idMascota + ", rutDueno=" + rutDueno + ", nombreMascota="
				+ nombreMascota + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

}
