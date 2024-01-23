package Ejercicos_profesor;

import java.util.Random;

/*
 * 9. Realiza un programa que vaya generando números aleatorios 
 * pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. 
El programa deberá decir al final cuántos
números se han generado.
 * 
 * */
public class AleEj9 {

	public static void main(String[] args) {
		// definimos y construimos el objeto ale de tipo Random
		Random ale = new Random();
		int num;
		int cont = 0;
		do {
			// generamos numeros pares entre [0,100]
			int numAle = ale.nextInt(51);
			num = numAle * 2;
			System.out.println(num);
			cont++;
		} while (num != 24);
		System.out.println("Cont:" + cont);

	}

}
