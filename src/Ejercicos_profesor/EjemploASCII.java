package Ejercicos_profesor;

import java.util.Scanner;

public class EjemploASCII {

	public static void main(String[] args) {
		// mostramos  de la a la z
		for (int i=97;i<=122;i++) {
			//casting o forzado de tipos
			char sigLetra=(char)(i);
			System.out.print(sigLetra+ " ");
		}
		// convertir de minusculas a mayusculas
		Scanner in=new Scanner(System.in);
		System.out.println("\nIntroduce un caracter:");
		char letra=in.nextLine().charAt(0);
		char letraMayuscula=(char)(letra-32);
		System.out.println("\n"+letraMayuscula);


	}

}
