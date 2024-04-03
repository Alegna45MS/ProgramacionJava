package UD7;

public abstract class Figura {
	private String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public abstract double obtenerArea();
	public abstract double obtenerVolumen();
	
	
}
