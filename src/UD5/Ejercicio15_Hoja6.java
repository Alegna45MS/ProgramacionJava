package UD5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15_Hoja6 {
/*
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 */
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String[] figuras= {"Corazon","Diamante","Herradura","Campana","Limon"};
		int opcion=0;
		do {
			System.out.println("Pulse 1 para jugar.Pulse 2 para salir");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				String[] tirada= {elegirFigura(figuras),elegirFigura(figuras),elegirFigura(figuras)};
				System.out.print(tirada[0]+" | "+tirada[1]+" | "+tirada[2]);
				System.out.println(" ");
				if(tirada[0] == tirada[1] && tirada[1]==tirada[2]) {
					System.out.println("Enhorabuena, ha ganado 10 monedas");
				}else if(tirada[0]==tirada[1] || tirada[1]==tirada[2] || tirada[0]==tirada[2]) {
					System.out.println("Bien, ha recuperado su moneda");
				}else {
					System.out.println("Lo siento, ha perdido");
				}
			}
			
		}while(opcion!=2);

	}
	public static String elegirFigura(String[] figuras) {
        // Utilizar la clase Random para elegir aleatoriamente una figura
        Random random = new Random();
        int indice = random.nextInt(figuras.length);
        return figuras[indice];
    }

}
