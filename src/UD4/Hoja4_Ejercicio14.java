package UD4;

import java.util.Scanner;
//Que rellene un array con 20 números y luego busque un número concreto
public class Hoja4_Ejercicio14 {

	public static void main(String[] args) {
		//definicion de constantes
		final int TAMAÑO=20;
		//declaracion
		Scanner entrada=new Scanner(System.in);
		int[] numeros=new int[TAMAÑO];
		int numBuscado=0;
		boolean numEncontrado=false;
		for(int i=0;i<TAMAÑO;i++) {
			System.out.println("Introduce un numero");
			numeros[i]=entrada.nextInt();
		}
		//Pedimos un numero
		System.out.println("Introduce el numero a buscar");
		numBuscado=entrada.nextInt();
		for(int i=0;i<TAMAÑO;i++) {
			if(numBuscado==numeros[i]&&(numEncontrado==false)) {
				System.out.println("La posicion del numero es: "+(i+1));
			numEncontrado=true;
			}
		}
		
	}

}
