package UD4;

import java.util.Scanner;

public class Calculadora {
//Calculadora que sume,reste,multiplique y divida
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		char opcion = '0';
		double operando1 = 0;
		double operando2 = 0;
		double resultado = 0;
		do {
			System.out.println("Escoge una opcion");
			System.out.println("Sumar(s)");
			System.out.println("Resta(r)");
			System.out.println("Multiplicar(m)");
			System.out.println("Dividir(d)");
			System.out.println("Salir(a)");
			opcion = entrada.nextLine().charAt(0);
			switch (opcion){
			case 's':
			case 'S':
				System.out.println("Introduce el primer operando");
				operando1=entrada.nextDouble();
				System.out.println("Introduce el segundo operando");
				operando2=entrada.nextDouble();
				entrada.nextLine();
				resultado = operando1 + operando2;
				System.out.println("El resultado de la suma es: "+resultado);
			break;
			case'r':
			case'R':
				System.out.println("Introduce el primer operando");
				operando1=entrada.nextDouble();
				System.out.println("Introduce el segundo operando");
				operando2=entrada.nextDouble();
				entrada.nextLine();
				resultado = operando1 - operando2;
				System.out.println("El resultado de la resta es: "+resultado);
			break;
			case'm':
			case'M':
				System.out.println("Introduce el primer operando");
				operando1=entrada.nextDouble();
				System.out.println("Introduce el segundo operando");
				operando2=entrada.nextDouble();
				entrada.nextLine();
				resultado = operando1 * operando2;
				System.out.println("El resultado de la multiplicacion es: "+resultado);
			break;
			case'd':
			case'D':
				System.out.println("Introduce el primer operando");
				operando1=entrada.nextInt();
				System.out.println("Introduce el segundo operando");
				operando2=entrada.nextInt();
				if (operando2 == 0) {
					System.out.println("El dividendo no puede ser 0. Vuelve a introducirlo");
					operando2 = entrada.nextInt();
				}
				entrada.nextLine();
				resultado = operando1 / operando2;
				System.out.println("El resultado de la division es: "+resultado);
			break;
			default:
				System.out.println("Salir");
			}
		   }while((opcion!='a')&& (opcion!='A'));{
			}
	}
}




