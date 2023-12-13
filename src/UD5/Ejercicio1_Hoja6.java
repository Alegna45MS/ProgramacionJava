package UD5;

import java.util.Random;

public class Ejercicio1_Hoja6 {
//Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
	public static void main(String[] args) {
		//Definimos y construimos objeto numeros aleatorios
		Random ale=new Random();
		for(int i=0;i<20;i++) {
			int tirada=ale.nextInt(11);
			System.out.print(tirada+" ");
			
		}

	}

}
