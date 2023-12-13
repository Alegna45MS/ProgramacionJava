package UD4;

public class Hoja4_Ejercicio17 {
//Que muestre los primeros 100 números de izquierda a derecha usando un
//array de dos dimensiones, la última fila a mostrará la suma de sus respectivas columnas.array 10x11
	
	public static void main(String[] args) {
		int[][] matriz=new int [10][11];
		int num=1;
		//Rellenar matriz
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j]=num;
				num=num+1;
			}
			for(int j=0;j<10;j++) {
				sumaArray(matriz[i]);
			}
		}
		
		System.out.println("Matriz con suma");
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		for(int k=0;k<10;k++) {
			System.out.print(matriz[k][10]+" ");
		}
		
	}
	public static int sumaArray(int[] vector) {
		int suma=0;
		for(int i=0;i<10;i++) {
			suma=suma+vector[i];
		}
		vector[10]=suma;
		return vector[10];
	}
}
