package UD5;

import java.util.Scanner;

public class Ejercicio2_Hoja5 {
//Realizar un programa que comprueba si una cadena leída por teclado comienza por una
//subcadena introducida por teclado.
	public static void main(String[] args) {
		boolean esIgual=false;
		String subCad="0";
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la cadena");
		String cad=entrada.nextLine();
		System.out.println("Introduce la subcadena");
		subCad=entrada.nextLine();
		
		if(comienzaporsubcadena(cad,subCad)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}
		public static boolean comienzaporsubcadena(String cad,String subCad) {
			int contletra=0;
			if(cad.length()<subCad.length()) {
				return false;
			}
			for(int i=0;i<subCad.length();i++) {
				if(cad.charAt(i)==subCad.charAt(i)) {
					contletra++;
				}
			}
			if(contletra==subCad.length()) {
				return true;
			}else {
				return false;
			}
			
		}
	
	}


