package UD5;

import java.util.Scanner;

public class Ejercicio11_Hoja5 {
/*
 *  Realizar una función a la que se le pasa por parámetro una cadena
con un email, y dicha función devuelve si el mail está bien formado.
Un email está bien formado cuando:
1.1.- Contiene una y solo una arroba.
1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
1.3.- No puede contener ''
 */
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escriba su email");
		String email=entrada.nextLine();
		System.out.println(tieneArroba(email));
		if(tieneArroba(email)==true && esCorrectoPuntos(email)==true) {
			System.out.println("El correo esta correcto");
		}
	}
	public static boolean tieneArroba(String email) {
		String[] parte=email.split("@");
		boolean tieneArroba=false;
		int contArroba=0;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@' && i!=0) {
				contArroba++;
			}
			if(contArroba<2 && contArroba>0) {
				tieneArroba=true;
		}
	}
		return tieneArroba;
	}
	public static boolean esCorrectoPuntos(String email) {
		boolean esCorrecto=false;
		int contPuntos=0;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='.' && email.charAt(i-1)=='@') {
				contPuntos++;
			}
			if(email.charAt(i)=='.' && email.charAt(i-1)=='.') {
				contPuntos++;
			}
			if(contPuntos<2 && contPuntos>0) {
				esCorrecto=true;
		}
		}
		return esCorrecto;
	}
}
