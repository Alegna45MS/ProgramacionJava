package UD5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6_Hoja6 {
//Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
//tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
//oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Random ale=new Random();
		int numSecreto=ale.nextInt(100);
		int num=0;
		int oportunidades=5;
		while(oportunidades>0 && num!=numSecreto) {
			System.out.println("Introduce un numero del 0 al 100 y intenta adivinar: ");
            num=entrada.nextInt();
            if (num==numSecreto) {
            	System.out.println("Enhorabuena,lo has adivinado");
            }else {
            	oportunidades=oportunidades-1;
            	if (num<numSecreto) {
            		System.out.println("El numero es mayor.Tienes "+oportunidades+" oportunidades");
            	}else {
            		System.out.println("El numero es menor.Tienes "+oportunidades+" oportunidades");
            	}
            	if(oportunidades==0) {
            		System.out.println("Ya no te queda mas intentos");
            	}
            }
		}

	}

}
