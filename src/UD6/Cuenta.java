package UD6;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String tit,double cant) {
		titular=tit;
		cantidad=cant;
	}
	public Cuenta(String tit) {
		titular=tit;
		cantidad=0;
	}
	//getter
	public String dameCuenta() {
		return titular+":"+cantidad;
	}
	public String dameTitular() {
		return titular;
	}
	public double dameCantidad() {
		return cantidad;
	}
	//setter
	public void cambiarCuenta(String newTitular,int newCant) {
		titular=newTitular;
		cantidad=newCant;
	}
	//metodos
	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.cantidad=this.cantidad+cantidad;
		}
	}
	public void retirar(double cantidad) {
		this.cantidad=this.cantidad-cantidad;
		if(this.cantidad<0) {
			this.cantidad=0;
		}
	}
}
