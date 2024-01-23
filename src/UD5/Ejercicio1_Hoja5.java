package UD5;

import java.util.Scanner;

public class Ejercicio1_Hoja5 {
//Escribir por pantalla cada carácter de una cadena introducida por teclado.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String cad="0";
		System.out.println("Introduce la cadena");
		cad=entrada.nextLine();
		for(int i=0;i<cad.length();i++) {
			char letra=cad.charAt(i);
			System.out.println(letra);
		}

	}

}
