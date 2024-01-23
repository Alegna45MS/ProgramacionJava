package Ejercicos_profesor;

import java.util.Random;
import java.util.Scanner;

/*
 * 6. Escribe un programa que piense un número al azar entre 0 
 * y 100. 
 * El usuario debe adivinarlo y tiene para ello 5 oportunidades.
 *  Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número introducido es menor o 
mayor que el número secreto.
 * */
public class AleEj6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random ale = new Random();
		int numSecreto=ale.nextInt(101);
		int num=0;
		int intentos=1;
		System.out.println("numero secreto:"+numSecreto);
		do {
			System.out.println("Introduce un numero");
			num=in.nextInt();
			//correcto
			if (num==numSecreto) {
				System.out.println("Has acertado");
			}
			if (num>numSecreto) {
				System.out.println("El numero secreto es menor");
			}
			if (num<numSecreto) {
				System.out.println("El numero secreto es mayor");
			}
			System.out.println("Numero de intentos consumidos:"+intentos);
			intentos++;
		} while (num!=numSecreto && intentos<6);

		System.out.println("");

	}

}
