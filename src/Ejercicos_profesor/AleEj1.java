package Ejercicos_profesor;

import java.util.Random;

//1. Muestra 20 números enteros aleatorios 
// entre 0 y 10 (ambos incluidos) separados por espacios
public class AleEj1 {
	public static void main(String[] args) {
		//definimos y construimos objeto numeros aleatorios
		Random ale=new Random();
		
		
		for (int i=0;i<20;i++) {
			int num=ale.nextInt(11)+2;
			System.out.print(num+" ");
		}
			
	}
}
