package UD7.Ejercicio4;

public class Empleado {
	private String nombre;
	private String apellido;
	private int numSeguridad;
	private double salario;
	
	public Empleado(String nombre, String apellido, int numSeguridad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numSeguridad = numSeguridad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNumSeguridad() {
		return numSeguridad;
	}

	public double getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNumSeguridad(int numSeguridad) {
		this.numSeguridad = numSeguridad;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", numSeguridad=" + numSeguridad + ", salario="
				+ salario + "]";
	}
	
}
