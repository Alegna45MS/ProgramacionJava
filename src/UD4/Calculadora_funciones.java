package UD4;

import java.util.Scanner;

public class Calculadora_funciones {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		char opcion='0';
		double num1,num2;
		double resultado;
		do {
			Mostrar_menu();
	        System.out.println("Por favor pulse una letra:");
	        opcion=entrada.nextLine().charAt(0);
			switch (opcion){
			case 's':
			case 'S':
				System.out.println("Introduce los numeros");
				num1=entrada.nextDouble();
				num2=entrada.nextDouble();
				entrada.nextLine();
				resultado=sumar(num1,num2);
				System.out.println("El resultado de la operación es "+resultado);
			break;
			case 'r':
			case 'R':
				System.out.println("Introduce los numeros");
				num1=entrada.nextDouble();
				num2=entrada.nextDouble();
				entrada.nextLine();
				resultado=restar(num1,num2);
				System.out.println("El resultado de la operación es "+resultado);
			break;
			case 'm':
			case 'M':
				System.out.println("Introduce los numeros");
				num1=entrada.nextDouble();
				num2=entrada.nextDouble();
				entrada.nextLine();
				resultado=multiplicar(num1,num2);
				System.out.println("El resultado de la operación es "+resultado);
			break;
			case 'd':
			case 'D':
				System.out.println("Introduce los numeros");
				num1=entrada.nextDouble();
				num2=entrada.nextDouble();
				if (num2==0) {
					System.out.println("El divisor no puede ser 0.");
					entrada.nextLine();
				}else {
					entrada.nextLine();
					resultado=dividir(num1,num2);
					System.out.println("El resultado de la operación es "+resultado);
				}
			break;
			case 'a':
			case 'A':
				System.out.println("Salir");
			break;
			default:
				System.out.println("Opcion invalida");
	}
	}while((opcion!='a')&&(opcion!='A'));{
	}
}
	public static void Mostrar_menu() {
		//Mostrar menu
		System.out.println("***** Calculadora de “Ángela Mancheño” *****");
		System.out.println("Suma(s)");
		System.out.println("Restar(r)");
		System.out.println("Multiplicar(m)");
		System.out.println("Dividir(d)");
		System.out.println("Salir(a)");
		System.out.println("******************");
	}
	public static double sumar(double a,double b) {
		//Sumar dos numeros
		return a+b;
	}
	public static double restar(double a,double b) {
		//Restar dos numeros
		return a-b;
	}
	public static double multiplicar(double a,double b) {
		//Multiplicar dos numeros
		return a*b;
	}
	public static double dividir(double a,double b) {
		//Dividir dos numeros
		return a/b;
	}
	
}
	