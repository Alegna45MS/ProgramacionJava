package UD6;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta c1=new Cuenta("Carlos",2000);
		Cuenta c2=new Cuenta("Yoli",1000);
		System.out.println(c1.dameCuenta());
		c1.ingresar(500);
		System.out.println(c1.dameCuenta());
		c1.retirar(3000);
		System.out.println(c1.dameCuenta());

	}

}
