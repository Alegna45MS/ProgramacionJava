package UD6;

public class gestorSanValentin {

	public static void main(String[] args) {
		Persona p1=new Persona("12345678H","Elena");
		Persona p2=new Persona("87654321D","Peter");
		Pareja pareja1=new Pareja(p1,p2);
		Regalo r1=new Regalo("osito",5,"Un osito de peluche");
		Regalo r2=new Regalo("anillo",100,"Un anillo de oro");
		pareja1.setRegaloParaPersona1(r2);
		pareja1.setRegaloParaPersona2(r1);
		pareja1.mostrarDetalles();
		System.out.println(pareja1.toString());
		

	}



}
