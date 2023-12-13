package Examen_ejercicios;

import java.util.Scanner;
public class EJERCICIO4_EXAMEN {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char letra='0';
		int cont=1;
		System.out.println("Introduce una letra");
		letra=entrada.nextLine().charAt(0);
		while((letra!='p')&&(letra!='i')) {
			System.out.println("La letra tiene que se o 'p' o 'i'.Pon una de las letras");
			letra=entrada.nextLine().charAt(0);
		}if(letra=='i') {
			while(cont<=500) {
				System.out.println(cont);
				cont=cont+2;
			}
		}
		cont=0;
		if(letra=='p') {
			while(cont<=500) {
				System.out.println(cont);
				cont=cont+2;
			}
		}
		
	}

}
