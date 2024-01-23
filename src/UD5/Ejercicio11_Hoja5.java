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
		String email=entrada.nextLine();
		if (emailEsCorrecto(email)==true) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto");
		}
		
	}
	public static boolean emailEsCorrecto(String email) {
		if(!contieneUnaArroba(email)) {
			return false;
		}if(contieneAlgunEspacio(email)) {
			return false;
		}if(contienePuntosSeguidos(email)) {
			return false;
		}else {
			return true;
		}
	}
	public static boolean contieneUnaArroba(String email) {
		int posPrimeraArroba=email.indexOf('@');
		int posUltimaArroba=email.lastIndexOf('@');
		//no hay ninguna @
		if(posPrimeraArroba==-1) {
			return false;
		}
		//solo hay una @
		if (posPrimeraArroba==posUltimaArroba) {
			return true;
		//hay mas de una arroba
		}else {
			return false;
		}
	}
	public static boolean contieneAlgunEspacio(String email) {
		//Si contiene un espacio " "
		if(email.contains(" ")) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean contienePuntosSeguidos(String email) {
		String[] partesEmail=email.split("@");
		boolean tieneDosPuntos=partesEmail[1].contains("..");
		if (tieneDosPuntos==true) {
			return true;
		}else {
			return false;
		}
	}
	
}
