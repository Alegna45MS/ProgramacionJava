package UD6;

public class UsoFracciones {

	public static void main(String[] args) {
		Fraccion f1=new Fraccion(15,45);
		Fraccion f2=new Fraccion(1,3);
		System.out.println(f1.mostrar());
		System.out.println(f2.mostrar());
	    System.out.println("SUMA");
		Fraccion f3=f1.sumar(f2);
		System.out.println(f3.mostrar());
		System.out.println("RESTA");
		Fraccion f4=f1.restar(f2);
		System.out.println(f4.mostrar());
		System.out.println("MULTIPLICACION");
		Fraccion f5=f1.multiplicar(f2);
		System.out.println(f5.mostrar());
		System.out.println("DIVISION");
		Fraccion f6=f1.dividir(f2);
		System.out.println(f6.mostrar());
		System.out.println("COMPROBAR SI SON IGUALES DESPUES DE SIMPLIFICAR");
		if(f2.esIgual(f1)==true) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		

	}

}
