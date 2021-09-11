package entidad;

public class Mascota {
	
	private int idMascota, rutDueno, edad;
	private String tipoMascota, nombreMascota;
	
	public Mascota() {

	}

	public Mascota(int idMascota, int rutDueno, int edad, String tipoMascota, String nombreMascota) {
		super();
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.edad = edad;
		this.tipoMascota = tipoMascota;
		this.nombreMascota = nombreMascota;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", rutDueno=" + rutDueno + ", edad=" + edad + ", tipoMascota="
				+ tipoMascota + ", nombreMascota=" + nombreMascota + "]";
	}
	
	

}
