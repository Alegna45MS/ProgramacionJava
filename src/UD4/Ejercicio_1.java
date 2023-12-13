package UD4;

import java.util.Scanner;

public class Ejercicio_1 {
	//Leer una palabra de 4 letras (letra a letra) y mostrar en una línea la palabra formada y su palíndroma.
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 final int TAMAÑO=4;
		 //Declaracion de variables
		 char[] palabra=new char[TAMAÑO];
		 char[] palindromo=new char[TAMAÑO];
		 //Introducimos la palabra letra por letra
		 for(int i=0;i<4;i++) {
			 System.out.println("Introduce las letras de la palabra");
			 palabra[i]=entrada.nextLine().charAt(0);
		}System.out.println(palabra);
		//Invertir la palabra
		 for(int i=0;i<TAMAÑO;i++) {
			 palindromo[i]=palabra[(TAMAÑO-1)-i];
		}
		 System.out.println(palindromo);	
	}
}
