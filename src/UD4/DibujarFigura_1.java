package UD4;

import java.util.Scanner;
//Segun el numero introducido,dibujar un triangulo de asteriscos
public class DibujarFigura_1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num,i,j;
		char aste='*';
		System.out.println("Introduce un numero");
		num=entrada.nextInt();
		for (i=0;i<num;i=i+1) {
			for (j=0;j<=i;j=j+1) {
				System.out.print(aste);
				
			}
			System.out.println("");
		}

	}

}
