package UD5;

import java.util.Scanner;

public class Ejercicio7_Hoja5 {
//Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición
//del primer carácter en la cadena por el segundo carácter.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una cadena");;
		String cad=entrada.nextLine();
		System.out.println("Introduce el primer caracter");
		char primerchar=entrada.nextLine().charAt(0);
		System.out.println("Introduce el segundo caracter");
		char segundochar=entrada.nextLine().charAt(0);
		//transformamos el string en array
		char[] charArray=new char[cad.length()];
		for (int i = 0; i < cad.length(); i++) {
            charArray[i] = cad.charAt(i);
            
		}
		for(int i=0;i<cad.length();i++) {
			if(charArray[i]==primerchar) {
				charArray[i]=segundochar;
			}
		}
		System.out.println(new String(charArray));
		

	}

}
