package UD6;

public class PruebaCuenta2 {

	public static void main(String[] args) {
		Cuenta2 c1=new Cuenta2("12345678");
		System.out.println(c1.dameSaldo());
		System.out.println(c1.dameCuenta());
		System.out.println(c1.toString());
		c1.recibirAbono(2000);
		System.out.println("Abono recibido:"+c1.dameSaldo());
		c1.pagarRecibo(500);
		System.out.println("Saldo despues de pagar el recibo: "+c1.dameSaldo());

	}

}
