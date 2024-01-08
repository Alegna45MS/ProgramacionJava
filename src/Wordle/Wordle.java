package Wordle;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	static Scanner in=new Scanner(System.in);
	static String palabraSecreta=generaPalabra();
	static int numIntentosConsumidos=0;
	static int numLetrasAdivinadas=0;
	public static void main(String[] args) {
		String palabra="";
		char opcion1;
		int ganaJugador=0,ganaMaquina=0,numPartidas=0;
		boolean palabraAdivinada=false;
		boolean palabraCorrecta=false;
		System.out.println(palabraSecreta);
		System.out.println("¿Quiere jugar al Wordle?(s/n)");
		do {
			opcion1=in.nextLine().charAt(0);
			switch(opcion1) {
			case 's':
			case 'S':
				menu();
				while (palabraAdivinada==false && haTerminadoJuego(numIntentosConsumidos)==false) { 
					palabra=in.nextLine();
					while(palabraCorrecta=false) { //Mientras la palabra siga mal escrita,sigue el bucle
						if(comprobarPalabra(palabra)==false) {
							System.out.println("No es una palabra valida. Vuelve a ponerlo");
							palabra=in.nextLine();
					}else {
						palabraCorrecta=true;
					}
				}
			}
				if(haGanadoJugador(palabra,palabraSecreta)==true) {
					ganaJugador++;
					numPartidas++;
					System.out.println("Has ganado la partida");
					System.out.println("Tú:"+ganaJugador+" vs Máquina:"+ganaMaquina);
					System.out.println("Total de partidas:"+numPartidas);
					System.out.println("¿Deseas jugar otra partida?(s/n)");
					
					
				}else {
					ganaMaquina++;
					numPartidas++;
					System.out.println("Has perdido la partida");
					System.out.println("Tú:"+ganaJugador+" vs Máquina:"+ganaMaquina);
					System.out.println("Total de partidas:"+numPartidas);
					System.out.println("¿Deseas jugar otra partida?(s/n)");
					
					
				}
				
			break;
			case 'n':
			case 'N':
				System.out.println("Adios");
		    break;
			default:
				System.out.println("Opcion no valida");
			}
		}while((opcion1!='n')&& (opcion1!='N')); {
		}
		
	}
	public static String compruebaLetrasAcertadas(String palabra) {
		
		return palabra;
		
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
		if (numIntentosConsumidos==6) {
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
	public static boolean comprobarPalabra(String palabra) {
		int contVocales=0;
		int contConsonantes=0;
		char caracter;
		if (palabra.length()!=5) {//Comprobar si la palabra es de longitud 5 o no
			return false;
		}
	    for(int i=0;i<palabra.length();i++) {//Comprobar si tiene numeros o caracteres especiales o no
		     caracter=palabra.charAt(i);
		     if(!Character.isLetter(caracter)) {
		    	 return false;
		}
	    }
		if(palabra.contains(" ")) { //Comprobar si tiene espacios
			return false;
		}for(int i=0;i<palabra.length();i++) { //Cuenta cuantas vocales tiene y si hay menor que 2 o mas que 3,no vale
			caracter=palabra.charAt(i);
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'|| caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
				contVocales++;
			}
		}if(contVocales!=2 && contVocales!=3) {
			return false;
		//Si contiene dos vocales seguidas iguales,no vale
		}if(palabra.contains("aa")||palabra.contains("ee")||palabra.contains("ii")||palabra.contains("oo")||palabra.contains("uu")||palabra.contains("AA")||palabra.contains("EE")||palabra.contains("II")||palabra.contains("OO")||palabra.contains("UU")) {
			return false;
		//Si la posicion 4 de la palabra es una 'q','w' o 'x',no vale
		}if(palabra.toLowerCase().charAt(4)=='q'||palabra.toLowerCase().charAt(4)=='w'||palabra.toLowerCase().charAt(4)=='x') {
			return false;
		}
		for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            if(Character.isLetter(caracter) && "aeiou".indexOf(caracter) == -1) {
            	contConsonantes++;
            }
            if (contConsonantes > 3) {
                return false;
            }else {
            	// Reiniciamos el contador si encontramos una vocal
            	contConsonantes = 0;
        }	
	}
		return true;
	}
}


