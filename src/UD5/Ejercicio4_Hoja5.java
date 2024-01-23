package UD5;

import java.util.Scanner;

public class Ejercicio4_Hoja5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la frase");
		String cad = entrada.nextLine();
		int contPalabra=0;
		//caso general
		for(int i=1;i<cad.length();i++) {
			if(cad.charAt(i-1)==' '&&(cad.charAt(i)!=' ')) {
				contPalabra++;
			}
		}
		//caso en que la primera palabra no comienza con espacio
		if(cad.charAt(0)!=' ') {
			contPalabra++;
		}
		System.out.println("Hay "+contPalabra+" palabras");
	}
}

