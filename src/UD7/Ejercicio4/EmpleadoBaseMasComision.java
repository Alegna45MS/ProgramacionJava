package UD7.Ejercicio4;

public class EmpleadoBaseMasComision extends Empleado {
	private double comision;
	private int numVentas;
	public EmpleadoBaseMasComision(String nombre, String apellido, int numSeguridad, double salario,double comision,int numVentas) {
		super(nombre, apellido, numSeguridad, salario);
		this.comision=comision;
		this.numVentas=numVentas;
	}
	public double getSalario() {
		return super.getSalario()+comision;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public String toString() {
		return super.toString()+"comision=" + comision+"Numero de ventas="+numVentas;
	}
	
}
