package Ejercicos_profesor;

import java.util.Scanner;

/*
 * Ejercicio 3
Pide una cadena y un carácter por teclado 
(valida que sea una letra) y muestra cuantas veces
aparece el carácter en la cadena.
 * */

public class CadEj3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String cad="";
		char letra='a';
		int cont=0;
		//Pedimos una Cadena
		System.out.println("Introduce una cadena");
		cad=in.nextLine();
		//Pedimos un caracter
		System.out.println("Introduce un caracter");
		letra=in.nextLine().charAt(0);
		
		for (int i=0;i<cad.length();i++) {
			if (letra==cad.charAt(i))
				cont++;
		}
		System.out.println("La letra "+letra+" se encuentra "+
				cont+" veces");
	}
}
