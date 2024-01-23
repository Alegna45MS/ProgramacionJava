package Examen_ejercicios;

import java.util.Scanner;

public class Ejercicio2_Examen2 {
	//Programar dos numeros estaticos.Pasar por teclado un nnumero entre 0 y 10 incluidos,tiene que devolver un booleano
	//Comprobar que el numero este entre 0 y 10.
	//Programar la tabla de multiplicar de ese numero
	public static void main(String[] args) {
		//Con DoWhile while(esvalido(num)==false):
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero del 0 al 10");
		num=entrada.nextInt();
		while(esValido(num)==false) {
			System.out.println("Nota no valida.Vuelve a ponerlo");
			num=entrada.nextInt();
		}
		multiplicar(num);
	}
	public static boolean esValido(int num) {
		boolean valido=false;
		while (valido==false) {
			if (num<=10 && num>=0) {
				valido=true;
			}
		}
		return valido;
	}
	public static void multiplicar(int num) {
		for(int i=0;i<11;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		return;
	}
}
