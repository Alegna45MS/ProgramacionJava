package UD5;

import java.util.Scanner;

public class Ejercicio5_Hoja5 {
//Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales
//en mayúsculas.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre y apellidos");
		String cad = entrada.nextLine();
		String iniciales=cad.charAt(0)+"";
		for(int i=1;i<cad.length();i++) {
			if(cad.charAt(i-1)==' '&&(cad.charAt(i)!=' ')) {
				iniciales=iniciales+cad.charAt(i);
			}
		}
		System.out.println(iniciales.toUpperCase());
		
	}

}
