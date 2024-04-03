package ClinicaVeterinaria;

public abstract class Animal {
	private String nombre,fechaNacimiento,comentarios;
	private double peso;
	
	public Animal(String nombre, String fechaNacimiento, double peso) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.comentarios = comentarios;
		this.peso = peso;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public abstract String dameDatosAnimal();
	
}
