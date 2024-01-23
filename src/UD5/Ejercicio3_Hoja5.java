package UD5;

import java.util.Scanner;

public class Ejercicio3_Hoja5 {
//Pide una cadena y un carácter por teclado (valida que sea una letra) y muestra cuantas veces
//aparece el carácter en la cadena.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int cont=0;
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		System.out.println("Introduce un caracter");
		char letra=entrada.nextLine().charAt(0);
		for(int i=0;i<cad.length();i++) {
			if (letra==cad.charAt(i)) {
				cont++;
			}
		}System.out.print("La letra aparece "+cont+" veces"+ "");
	}

}
