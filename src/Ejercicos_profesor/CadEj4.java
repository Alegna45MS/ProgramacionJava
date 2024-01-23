package Ejercicos_profesor;

import java.util.Scanner;

/*
 * Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras
separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
 * */
public class CadEj4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce cadena:");
		String cad=in.nextLine();
		int contPalabras=0;
		//caso general
		for (int i=1;i<cad.length();i++) {
			if ((cad.charAt(i-1)==' ')&&(cad.charAt(i)!=' '))
				contPalabras++;
		}
		//caso de que la primera palabra NO comienza por espacio
		if (cad.charAt(0)!=' ')
			contPalabras++;

		System.out.println(cad + " tiene "+(contPalabras)+" palabras");

	}

}
