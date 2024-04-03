package UD7;

public class Persona {
	private String nombre;
	private String apellido;
	private String DNI;
	private String EstCivil;
	
	public Persona(String nombre,String apellido,String dni,String estCivil) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=dni;
		this.EstCivil=estCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEstCivil() {
		return EstCivil;
	}

	public void setEstCivil(String estCivil) {
		EstCivil = estCivil;
	}

	public String toString() {
		return "Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", DNI=" + getDNI() + ", Estado Civil=" + getEstCivil();
	}
	
}
