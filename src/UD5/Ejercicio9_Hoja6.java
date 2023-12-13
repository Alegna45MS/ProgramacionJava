package UD5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9_Hoja6 {
//Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
//termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos
//números se han generado.

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//Crear objeto ale para crear numeros random
		Random ale=new Random();
		int num=0;
		int numCant=0;
		while(num!=24) {
			num=ale.nextInt(100);
			if(num%2==0) {
				System.out.print(num+" ");
				numCant++;
			}
		}
		System.out.println("La cantidad de numeros generados es: "+numCant);

	}

}
