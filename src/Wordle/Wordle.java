package Wordle;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	static Scanner in=new Scanner(System.in);
	static String palabraSecreta=generaPalabra();
	static int numIntentosConsumidos=6;
	static int numLetrasAdivinadas=0;
	public static void main(String[] args) {
		String palabra="";
		char opcion=0;
		boolean palabraCorrecta=false;
		System.out.println("¿Quiere jugar al wordle?(s/n");
		do {
			opcion=in.nextLine().charAt(0);
			switch(opcion) {
			case 's':
			case 'S':
				menu();
				while (palabraCorrecta==false) {
					palabra=in.nextLine();
					
				}
				
			}
			
			
		}
		
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
	public static void menu() {
		System.out.println("Bienvenid@ al juego de Wordle.");
		System.out.println("El objetivo es descubrir la palabra oculta de 5 letras");
		System.out.println("Introduce una palabra de 5 letras:");
	}
	public static void comprobarPalabra() {
		
	}
}

