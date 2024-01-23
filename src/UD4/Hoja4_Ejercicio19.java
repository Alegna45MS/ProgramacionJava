package UD4;

import java.util.Scanner;

public class Hoja4_Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int[][] matriz=new int [3][3];
		int num;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Introduce un numero");
				num=entrada.nextInt();
				matriz[i][j]=num;
			}
		}
		System.out.println("Matriz");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matriz traspuesta");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[j][i]+" ");
			}
			System.out.println();
		}
		

	}

}
