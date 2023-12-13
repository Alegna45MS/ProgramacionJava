package Examen_ejercicios;

import java.util.Scanner;

//pedir numero de 5 cifras,se debe controlar y si no es se pide de nuevo.
//Mostrar por pantalla si es capicua o no
public class Ejercicio1_Examen2 {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num=0,dm=0,um=0,d=0,u=0,c=0;

		System.out.println("Di un numero");
		num=entrada.nextInt();
		while (num<10000 && num>99999) {
			System.out.println("Fuera de rango.Vuelve a ponerlo");
			num=entrada.nextInt();
		}
		while(num>=10000) {
			num=num-10000;
			dm++;
		}
		while(num>=1000) {
			num=num-1000;
			um++;
		}
		while(num>=100) {
			num=num-100;
			c++;
		}
		while(num>=10) {
			num=num-10;
			d++;
		}
		if (dm==u && um==d) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicuaaaaaaaaa");
		}
		}
		

	}
