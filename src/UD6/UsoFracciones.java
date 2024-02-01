package UD6;

public class UsoFracciones {

	public static void main(String[] args) {
		Fraccion f1=new Fraccion(15,45);
		Fraccion f2=new Fraccion(1,3);
		f1.sumar(f2);
		System.out.println(sum.mostrar());
		if(f2.esIgual(f1)==true) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}

	}

}
