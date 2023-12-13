package UD4;

import java.util.Scanner;

public class Numero_Amstrong {
//Dado un numero de 3 cifras,calcular si es un numero Amstrong o no
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num;
		int suma;
		int c;
		int d;
		int u;
		System.out.println("Introduce un numero de 3 cifras: ");
		num=entrada.nextInt();
		c = num/100;
		d = (num%100)/10;
		u = num%10;
		suma = c*c*c + d*d*d + u*u*u;
		if(num==suma) {
			System.out.println(num+" Es un numero amstrong");
		}else {
			System.out.println(num+" No es un numero amstrong");
		}

	}

}
