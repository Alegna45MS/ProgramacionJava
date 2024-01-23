package Wordle;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	static Scanner in = new Scanner(System.in);
	static String palabraSecreta = generaPalabra();
	static int numIntentosConsumidos = 0;
	static int numLetrasAdivinadas = 0;

	public static void main(String[] args) {
		String palabra = "";
		char opcion;
		int ganaJugador = 0, ganaMaquina = 0, numPartidas = 0;
		System.out.println("¿Quiere jugar al Wordle?(s/n)");
		do {
			opcion = in.nextLine().charAt(0);
			switch (opcion) {
			case 's':
			case 'S':
				menu1();
				boolean palabraCorrecta = false;
				while (haGanadoJugador(palabra, palabraSecreta) == false
						&& haTerminadoJuego(numIntentosConsumidos) == false) {
					palabra = in.nextLine();
					while (palabraCorrecta == false) { // Mientras la palabra siga mal escrita,sigue el bucle
						if (comprobarPalabra1(palabra) == false) {
							System.out.println("No es una palabra valida. Vuelve a ponerlo");
							palabra = in.nextLine();
						} else {
							palabraCorrecta = true;
						}
					}
					//Una vez que comprobamos que la palabra está bien escrita,comprobamos las letras adivinadas
					System.out.println(compruebaLetrasAcertadas(palabra));
					if (palabra.equalsIgnoreCase(palabraSecreta) == false) {
						numIntentosConsumidos++;
					}
				}
				if(numLetrasAdivinadas==5) {
					ganaJugador++;
					System.out.println("Has ganado la partida");
				}else{
					ganaMaquina++;
					System.out.println("Has perdido la partida");
				}
				numPartidas++;
				System.out.println("Tú:" + ganaJugador + " vs Máquina:" + ganaMaquina);
				System.out.println("Total de partidas:" + numPartidas);
				System.out.println("¿Deseas jugar otra partida?(s/n)");
				palabraSecreta = generaPalabra();
				numIntentosConsumidos = 0;
				numLetrasAdivinadas = 0;
				break;
			case 'n':
			case 'N':
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while ((opcion != 'n') && (opcion != 'N'));
		{
		}

	}

	public static String compruebaLetrasAcertadas(String palabra) {
		String palabraComprobada = "";
		palabra=palabra.toLowerCase();
		for (int i = 0; i < palabra.length(); i++) {
			char caracter = palabra.charAt(i);
			if (caracter == palabraSecreta.charAt(i)) {
				palabraComprobada=palabraComprobada.concat(Character.toString(caracter).toUpperCase());
				numLetrasAdivinadas++;
			} else if (palabraSecreta.contains(Character.toString(caracter))) {
				palabraComprobada=palabraComprobada.concat(Character.toString(caracter).toLowerCase());
			} else {
				palabraComprobada=palabraComprobada.concat("*");
			}
		}
		if(numLetrasAdivinadas!=5) {
			numLetrasAdivinadas=0;
		} 
		return palabraComprobada;

	}

	public static String generaPalabra() {
		Random ale = new Random();
		String[] palabras = { "arroz", "carne", "chile", "curry", "mango", "sushi", "pasta", "pizza", "tarta", "gallo",
				"perro", "burro", "erizo", "cisne", "zorro", "raton", "abeja", "cabra", "cerdo", "araña" };
		String palabraSecreta = palabras[ale.nextInt(20)];
		return palabraSecreta;
	}

	public static boolean haGanadoJugador(String palabra, String palabraSecreta) {
		boolean haGanado = false;
		if (palabra.equalsIgnoreCase(palabraSecreta)) {
			haGanado = true;
			return haGanado;
		} else {
			return haGanado;
		}
	}

	public static boolean haTerminadoJuego(int numIntentosConsumidos) {
		if (numIntentosConsumidos == 6) {
			return true;
		} else {
			return false;
		}
	}

	public static void menu1() {
		System.out.println("Bienvenid@ al juego de Wordle.");
		System.out.println("El objetivo es descubrir la palabra oculta de 5 letras");
		System.out.println("Introduce una palabra de 5 letras:");
	}

	public static boolean comprobarPalabra1(String palabra) {
		int contVocales = 0;
		int contConsonantes = 0;
		char caracter;
		palabra=palabra.toLowerCase(); //Convertimos primero la palabra en minuscula
		if (palabra.length() != 5) {// Comprobar si la palabra es de longitud 5 o no
			return false;
		}
		for (int i = 0; i < palabra.length(); i++) {// Comprobar si tiene numeros o caracteres especiales o no
			caracter = palabra.charAt(i);
			if (!Character.isLetter(caracter)) {
				return false;
			}
		}
		if (palabra.contains(" ")) { // Comprobar si tiene espacios
			return false;

		}
		for (int i = 0; i < palabra.length(); i++) { // Cuenta cuantas vocales tiene y si hay menor que 2 o mas que 3,no
														// vale
			caracter = palabra.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				contVocales++;
			}
		}
		if (contVocales != 2 && contVocales != 3) {
			return false;

			// Si contiene dos vocales seguidas iguales,no vale
		}
		if (palabra.contains("aa") || palabra.contains("ee") || palabra.contains("ii") || palabra.contains("oo")
				|| palabra.contains("uu")) {
			return false;

			// Si la posicion 4 de la palabra es una 'q','w' o 'x',no vale
		}
		if (palabra.charAt(4) == 'q' || palabra.charAt(4) == 'w'
				|| palabra.charAt(4) == 'x') {
			return false;
		}
		
		for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            //Si el caracter es una consonante,sumamos a el contador.Si encontramos una vocal,pasamos al siguiente "if"
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
