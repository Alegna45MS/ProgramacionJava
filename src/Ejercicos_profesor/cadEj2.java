package Ejercicos_profesor;

import java.util.Scanner;

/*Realizar un programa que comprueba si una cadena leída 
 * por teclado comienza por una subcadena introducida 
 * por teclado.
 */

public class cadEj2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce cadena");
		String cad=in.nextLine();
		System.out.println("Introduce subcadena");
		String subcad=in.nextLine();
		
		if (comienzaPorSubcadena1(cad,subcad)==true)
			System.out.println("La subcadena está incluida en la cadena y comienza por ella");
		else 
			System.out.println("La subcadena NO está incluida en la cadena o no empieza por ella");

	}
	
	public static boolean comienzaPorSubcadena1(String cad,String subcad) {
		int contLetras=0;
		//compruebo que la cadena es menor a la subcadena
		if (cad.length()<subcad.length())
			return false;
		//compruebo letra a letra e incremento el contador en ese caso
		for (int i=0;i<subcad.length();i++) {
			if (cad.charAt(i)==subcad.charAt(i))
				contLetras++;
		}
		//comprobamos si el contador es igual al tamaño de la subcadena
		if (contLetras==subcad.length())
			return true;
		else
			return false;
	}


}
