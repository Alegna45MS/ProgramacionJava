package UD6;

public class PruebaCuenta2 {

	public static void main(String[] args) {
		Persona2 p1=new Persona2("12345678A");
		p1.addCuenta("c1");
		
		Cuenta2 c1=p1.dameCuenta("c1");
		c1.recibirAbono(100);
		//Cuenta
		//p1.dameCuenta("c1").pagarRecibo(200);
		
		//if(p1.esMorosa()) {
			//System.out.println("Es morosa");
		//}else {
			//System.out.println("No es morosa");
		}
		/*System.out.println(c1.toString());
		c2.recibirAbono(700);
		System.out.println(c2.toString());
		System.out.println("Despues de ingresar en la primera cuenta");
		c1.recibirAbono(1100);
		System.out.println(c1.toString());
		System.out.println("Despues de pagar el alquiler");
		c2.pagarRecibo(750);
		System.out.println(p1.esMorosa());
		System.out.println(c2.toString());
		System.out.println("Transferencia de una cuenta a otra");
		c1.pagarRecibo(500);
		c2.recibirAbono(500);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(p1.esMorosa());*/
		

	}


