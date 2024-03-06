package UD7;

public class Comercial extends Empleadoo{
	private double comision;
	
	//constructor
	public Comercial(String dni,String nombre,double sueldo,double comision) {
		//llamamos al constructor de la clase padre
		super(dni,nombre,sueldo);
		this.comision=comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	public double getSueldo() {
		return super.getSueldo()+comision;
	}
}
