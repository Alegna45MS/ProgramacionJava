package UD5;

import java.util.Random;

public class Ejercicio5_Hoja6 {
//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
//espacios. Muestra también el máximo, el mínimo y la media de esos números.
	public static void main(String[] args) {
		//Definimos y construimos objeto numeros aleatorios
		Random ale=new Random();
		int suma=0;
		int maximo=0;
		int minimo=199;
		for(int i=0;i<50;i++){
			int num=ale.nextInt(100)+100;
			System.out.print(num+" ");
			suma=suma + num;
			maximo=Math.max(maximo, num);
			minimo=Math.min(minimo, num);
		}
		double media=suma/50;
		System.out.println(" ");
		System.out.println("La media de los 50 numero es:"+media);
		System.out.println("El maximo es: "+maximo);
		System.out.println("El minimo es: "+minimo);
	}
	
}
