package TresEnRayaPOO;

import java.util.Scanner;

public class UsoTresEnRaya {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("Bienvenido al tres en raya.Quemodo quieres jugar?");
			System.out.println("1.Jugador vs Jugador");
			System.out.println("2.Jugador vs maquina");
			System.out.println("3.Maquina vs maquina");
			System.out.println("4.Salir");
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				jugadorVSjugador();
			break;
			case 2:
				jugadorVSmaquina();
			break;
			case 3:
				maquinaVSmaquina();
			break;
			case 4:
				System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion!=4);
	}
	public static void jugadorVSjugador() {
		TresEnRaya tablero=new TresEnRaya();
		System.out.println("-------------");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("-------------");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("-------------");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("-------------");
		tablero.iniciar();
		tablero.DibujarTablero();
	}
	public static void jugadorVSmaquina() {
		TresEnRaya tablero=new TresEnRaya();
		System.out.println("-------------");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("-------------");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("-------------");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("-------------");
		tablero.iniciar();
		tablero.DibujarTablero();
	}
	public static void maquinaVSmaquina() {
		TresEnRaya tablero=new TresEnRaya();
		System.out.println("-------------");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("-------------");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("-------------");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("-------------");
		tablero.iniciar();
		tablero.DibujarTablero();
	}

}
