package UD6;

public class Persona {
	private String dni;
	private String nombre;
	
	public Persona(String dni,String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	public String getDNI() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String toString() {
		return "Nombre:"+nombre+" DNI:"+dni;
	}

}
