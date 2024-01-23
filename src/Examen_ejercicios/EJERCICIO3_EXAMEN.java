package Examen_ejercicios;

import java.util.Scanner;

public class EJERCICIO3_EXAMEN {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,cont=0;
		System.out.println("Introduce los dos numeros");
		a=entrada.nextInt();
		b=entrada.nextInt();
		 if(((a<0)||(a>100))&&((b<0)||(b>100))) {
			 System.out.println("Los dos numeros tienen que estar entre 0 y 100");
		}else if(a==b) {
			System.out.println("Los dos numeros no pueden ser iguales");
		}else {
			while(a<=b) {
				System.out.println(a);
                a=a+1;
			}
			while (a>=b){
				System.out.println(a);
				a=a-1;
			}
		}
			
		
	}

}
