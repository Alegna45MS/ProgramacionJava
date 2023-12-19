package Wordle;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	static Scanner entrada=new Scanner(System.in);
	static String palabraSecreta=generaPalabra();
	static int numIntentosConsumidos=6;
	static int numLetrasAdivinadas=0;
	public static void main(String[] args) {
		
		
	}
	public static String generaPalabra() {
		Random ale = new Random();
		String [] palabras = {"arroz","carne","chile","curry","mango","sushi","pasta","pizza","tarta","gallo","perro",
		                      "burro","erizo","cisne","zorro","raton","abeja","cabra","cerdo","araña"};
		String palabraSecreta=palabras[ale.nextInt(20)];
		return palabraSecreta;
		}
	public static boolean haGanadoJugador(String palabra,String palabraSecreta) {
		boolean haGanado=false;
		if (palabra.equals(palabraSecreta)) {
			haGanado=true;
			return haGanado;
		}else {
			return haGanado;
		}
	}
	public static boolean haTerminadoJuego(int numIntentosConsumidos) {
		if (numIntentosConsumidos==0) {
			return true;
		}else {
			return false;
		}
	}
}

