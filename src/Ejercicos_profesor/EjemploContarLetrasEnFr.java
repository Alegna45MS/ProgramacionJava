package Ejercicos_profesor;

import java.util.Scanner;

public class EjemploContarLetrasEnFr {

	public static void main(String[] args) {
		int numLetrasAlfabeto='z' - 'a' + 1 ;
		int[] contLetras=new int[numLetrasAlfabeto];
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase=in.nextLine();
		frase=frase.toLowerCase();
		//recorremos la frase letra a letra
		for (int i=0;i<frase.length();i++) {
			//transformo la letra en un índice
			// 'a' - 0
			// 'b' - 1 etc
			int pos=frase.charAt(i)-'a';
			if ((pos>=0)&&(pos<=numLetrasAlfabeto))
				contLetras[pos]++;
		}
		for (int i=0;i<numLetrasAlfabeto;i++) {
			if (contLetras[i]>0)
				System.out.println((char)(i+'a')+" "+contLetras[i]);
		}
		
		

	}

}
