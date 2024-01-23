package Ejercicos_profesor;

import java.util.Scanner;

public class CadEj1 {

	public static void main(String[] args) {
		String cad="";
		Scanner in=new Scanner(System.in);
		
		//leemos una cadena por teclado
		System.out.println("Introduce una cadena");
		cad=in.nextLine();
		
		for (int i=0;i<cad.length();i++) {
			char letra=cad.charAt(i);
			System.out.println(letra);
		}

		

	}

}
