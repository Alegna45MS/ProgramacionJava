package UD5;

import java.util.Random;

public class Ejercicio12_Hoja6 {
/*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando
	los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
 */
	public static void main(String[] args) {
		Random ale=new Random();
		int dado1,dado2;
		boolean iguales=false;
		while(iguales==false) {
			dado1=ale.nextInt(6)+1;
			dado2=ale.nextInt(6)+1;
			System.out.println(dado1+" y "+dado2);
			if(dado1==dado2) {
				System.out.println("Ambos dados son iguales");
				iguales=true;
			}
	  }	
	}

}
