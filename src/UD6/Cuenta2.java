package UD6;

public class Cuenta2 {
	private int numeroCuenta;
	private double saldo;
	
	
	public Cuenta2(int numCuenta) {
		numeroCuenta=numCuenta;
		saldo=0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String toString() {
		return "Numero de cuenta:"+numeroCuenta+","+"Saldo:"+saldo;
	}
	public void recibir(double cantidad) {
		if (cantidad>0) {
			saldo=saldo+cantidad;
		}
	}
	public void pagar(double cantidad) {
		saldo=saldo-cantidad;
		if(saldo<0) {
			saldo=0;
		}
	}
}

