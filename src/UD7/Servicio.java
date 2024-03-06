package UD7;

public class Servicio extends Empleado {
	private String seccion;
	
	public Servicio(String nombre, String apellido, String dni, String estCivil, String finco, int numDespacho,String seccion) {
		super(nombre, apellido, dni, estCivil, finco, numDespacho);
		this.seccion=seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String toString() {
		return super.toString()+"seccion=" + seccion;
	}
	
}
