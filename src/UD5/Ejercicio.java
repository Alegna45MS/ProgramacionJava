package UD5;

import java.util.Scanner;

public class Ejercicio {
//hacer programa que lea una frase e indique cuantas veces aparecen cada letra en dicha frase
//ejemplo:En un lugar de la mancha
	//a:4veces c:1vez d:1vez e:2veces
	public static void main(String[] args) {
		//String[] letras= { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Scanner in=new Scanner(System.in);
		int[] numletras;
		numletras=new int['z'-'a'+ 1];//ASCII casteo
		System.out.println("Introduce una frase");
		String frase=in.nextLine();
		frase=frase.toLowerCase();
		for (int i=0;i<frase.length();i++) {
			if(Character.isLetter(frase.charAt(i))) {
				numletras[frase.charAt(i)-'a']++;
			}
		}
		for(int i=0;i<numletras.length;i++) {
			System.out.println("La letra "+(char)(i+'a')+" se repite"+numletras[i]+" veces");
		}
		
	}

}
