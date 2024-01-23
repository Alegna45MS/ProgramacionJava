package UD5;

import java.util.Scanner;

public class Ejercicio6_Hoja5 {
//Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena
//resultado de invertir la primera.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la cadena");
		String cad=entrada.nextLine();
		System.out.println(InvertirCadena(cad));

	}
	public static String InvertirCadena(String cad) {
		char[] caracteres = new char[cad.length()];
		for (int i = 0; i < cad.length(); i++) {
            caracteres[i] = cad.charAt(i);
        }
		 for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
	            char aux = caracteres[i];
	            caracteres[i] = caracteres[j];
	            caracteres[j] = aux;
	        }
		 return new String(caracteres);
	}
}
