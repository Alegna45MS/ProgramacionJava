package UD7;

public class Empleado extends Persona {
	private String fIncorporacion;
	private int numDespacho;
	
	public Empleado(String nombre, String apellido, String dni, String estCivil,String finco,int numDespacho) {
		super(nombre, apellido, dni, estCivil);
		this.fIncorporacion=finco;
		this.numDespacho=numDespacho;
	}

	public String getfIncorporacion() {
		return fIncorporacion;
	}

	public void setfIncorporacion(String fIncorporacion) {
		this.fIncorporacion = fIncorporacion;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
	public String toString() {
		return super.toString()+"fIncorporacion=" + fIncorporacion + ", numDespacho=" + numDespacho;
	}
	

}
