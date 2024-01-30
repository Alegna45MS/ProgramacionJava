package UD6;

public class UsoPersona2 {

	public static void main(String[] args) {
		Persona2 p1=new Persona2("13579246S");
		p1.addCuenta("c1");
		p1.dameCuenta("c1").recibirAbono(100);
		System.out.println(p1);
		

	}

}
