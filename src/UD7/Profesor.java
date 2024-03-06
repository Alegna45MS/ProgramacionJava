package UD7;

public class Profesor extends Empleado{
	private String departamento;
	
	public Profesor(String nombre, String apellido, String dni, String estCivil, String finco, int numDespacho,String departamento) {
		super(nombre, apellido, dni, estCivil, finco, numDespacho);
		this.departamento=departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		return super.toString()+"departamento=" + departamento;
	}
}
