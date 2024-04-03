package UD7.Ejercicio4;

public class EmpleadoPorComision extends EmpleadoBaseMasComision{
	
	public EmpleadoPorComision(String nombre, String apellido, int numSeguridad,int numVentas,double comision) {
		super(nombre, apellido, numSeguridad,0, comision, numVentas);
	}
	public double getSalario() {
		return super.getNumVentas()*super.getComision();
	}
	public String toString() {
		return super.toString();
	}
	

}
