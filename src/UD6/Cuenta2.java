package UD6;

public class Cuenta2 {
	private String numeroCuenta;
	private double saldo;
	
	
	public Cuenta2(String numCuenta) {
		numeroCuenta=numCuenta;
		saldo=0;
	}
	
	public double dameSaldo() {
		return saldo;
	}
	public String dameCuenta() {
		return numeroCuenta;
	}
	public String toString() {
		return "Numero de cuenta:"+numeroCuenta+","+"Saldo:"+saldo;
	}
	
	public void recibirAbono(double cantidad) {
		if (cantidad>0) {
			saldo=saldo+cantidad;
		}
	}
	public void pagarRecibo(double cantidad) {
		saldo=saldo-cantidad;
		if(saldo<0) {
			saldo=0;
		}
	}
}

