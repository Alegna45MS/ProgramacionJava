package UD4;

public class Hoja5_Ejercicio2y4 {

	public static void main(String[] args) {
		int cuadr=cuadrado(3);
		System.out.println(cuadr);
		int med=media(6,2);
		System.out.println(med);

	}
	public static int cuadrado(int num) {
		int resultado;
		resultado=num*num;
		return resultado;
	}
	public static int media(int a,int b) {
		int med;
		med=(a+b)/2;
		return med;
	}

}
