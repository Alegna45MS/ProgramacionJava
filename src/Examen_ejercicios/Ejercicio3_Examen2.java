package Examen_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Examen2 {
//Funcion pedirEdad(int[]edades) , funcion double calcularEdadMedia(int[]edades) , funcion personasenedadjuvilacion(int[]edades)
	public static void main(String[] args) {
		int[] edades=new int[10];
		pedirEdades(edades);
		System.out.println("La media de edades es:"+calcularMediaEdades(edades));
		System.out.println("La cantidad de personas en juvilacion es:"+PersonasEnJuvilacion(edades));
	}
	public static void pedirEdades(int[]edades) {
		Scanner entrada=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Introduce las edades");
			edades[i]=entrada.nextInt();
		}
	}
	public static double calcularMediaEdades(int[]edades) {
		double media;
		int suma=0;
		for(int i=0;i<10;i++) {
			suma=suma+edades[i];
		}
		media=suma/10;
		return media;
	}
	public static int PersonasEnJuvilacion(int[]edades) {
		int cont=0;
		for(int i=0;i<10;i++) {
			if(edades[i]>=65) {
				cont++;
			}
		}
		return cont;
	}

}
