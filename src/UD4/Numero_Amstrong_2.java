package UD4;

import java.util.Scanner;

public class Numero_Amstrong_2 {
//Dado un numero de 3 cifras,calcular si es un numero Amstrong o no
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num;
		int numleido = 0;
		int contC = 0,contD = 0,contU = 0;
		int suma = 0;
		System.out.println("Introduce un numero de 3 cifras");
		numleido = entrada.nextInt();
		num= numleido;
		while (num>=100) {
			num = num-100;
			contC=contC+1;
		}
		while (num>=10) {
			num = num-10;
			contD = contD+1;
		}
		contU=num;
		suma = contC*contC*contC + contD*contD*contD + contU*contU*contU;
		if (numleido == suma) {
			System.out.println("Es un numero Amstrong");
		}else {
			System.out.println("No es un numero Amstrong");
		}
		
	}

}
