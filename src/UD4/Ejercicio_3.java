package UD4;

import java.util.Scanner;

public class Ejercicio_3 {
//Leer 5 números, almacenarlos en un array y ordenarlos por el método de la burbuja
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamaño=5;
		int[] numeros = new int[tamaño];
		int aux;
		for(int i=0;i<tamaño;i++) {
			System.out.println("Introduce los numeros");
			numeros[i]=entrada.nextInt();
		}
		//Ordenamos los numeros por el metodo de la burbuja
		for(int i=0;i<tamaño;i++) {
			for(int j=0;j<tamaño-1;j++) {
				if(numeros[j+1]<numeros[j]) {
					aux=numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
        System.out.println("Números ordenados: ");
        for (int k=0; k<tamaño;k++) {
            System.out.print(numeros[k]);
        }
		
	}

}
