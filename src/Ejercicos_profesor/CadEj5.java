package Ejercicos_profesor;

import java.util.Scanner;

/*
 * Si tenemos una cadena con un nombre y apellidos, 
 * realizar un programa que muestre las iniciales
en mayúsculas.
 * 
 * */
public class CadEj5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce cadena:");
		String cad=in.nextLine();
		String iniciales=cad.charAt(0)+"";
		//separamos en palabras
		int contPalabras=0;
		//caso general
		for (int i=1;i<cad.length();i++) {
			if ((cad.charAt(i-1)==' ')&&(cad.charAt(i)!=' '))
				iniciales=iniciales+cad.charAt(i);
		}
		//caso de que la primera palabra NO comienza por espacio
		iniciales =iniciales.toUpperCase();
		System.out.println(iniciales);

	}

}
