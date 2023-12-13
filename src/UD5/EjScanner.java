package UD5;

import java.util.Scanner;

public class EjScanner {
//Hacer un programa que lea un numero entero y lo multiplique por 2
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un entero");
		boolean esEntero=entrada.hasNextInt();
		if(esEntero==true) {
			int num=entrada.nextInt();
			System.out.println("El numero multiplicado por dos es: "+(num*2));
		}else {
			System.out.println("El numero no es entero");
		}

	}

}
