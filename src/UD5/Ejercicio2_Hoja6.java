package UD5;

import java.util.Random;

public class Ejercicio2_Hoja6 {
//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
//total (los puntos que suman entre los tres dados
	public static void main(String[] args) {
		Random ale=new Random();
		int suma=0;
		for(int i=0;i<3;i++) {
			int tirada=ale.nextInt(7);
			System.out.print(tirada+" ");
			suma=suma+tirada;
		}
		System.out.println(" ");
		System.out.println("la suma de las tiradas es:"+suma);
	}

}
