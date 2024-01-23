package UD6;

public class PruebaRectangulo {

	public static void main(String[] args) {
		Rectangulo Rectangulo1 = new Rectangulo(10,5);
		System.out.println("Rectangulo 1");
		System.out.println("base: "+Rectangulo1.dameBase());
		System.out.println("altura: "+Rectangulo1.dameAltura());
		System.out.println("Area="+Rectangulo1.calcularArea());
		System.out.println("Perimetro="+Rectangulo1.calcularPerimetro());
		System.out.println(" ");
		Rectangulo Rectangulo2 = new Rectangulo(100,200);
		System.out.println("Rectangulo 2");
		System.out.println("base: "+Rectangulo2.dameBase());
		System.out.println("altura: "+Rectangulo2.dameAltura());
		System.out.println("Area="+Rectangulo2.calcularArea());
		System.out.println("Perimetro="+Rectangulo2.calcularPerimetro());
		

	}

}
