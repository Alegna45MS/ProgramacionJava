package TresEnRayaPOO;

import java.util.Scanner;
import java.util.Random;

public class UsoTresEnRaya {
	static Scanner in=new Scanner(System.in);
	static Random random=new Random();
	public static void main(String[] args) {
		int opcion=0;
		do {
			System.out.println("Bienvenido al tres en raya.Que modo quieres jugar?");
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
		int pos1,pos2;
		TresEnRaya tablero=new TresEnRaya();
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
		tablero.iniciar();
		while(tablero.ganaJugador1()==false && tablero.ganaJugador2()==false && tablero.quedanMovimientos()==false) {
			System.out.println("Introduzca movimiento (Jugador 1)");
			pos1=in.nextInt();
			while(tablero.movimientoValido(pos1)==false) {
				System.out.println("Movimiento no valido.Vuelve a ponerlo");
				pos1=in.nextInt();
			}
			tablero.mueveJugador1(pos1);
			tablero.DibujarTablero();
			if(tablero.quedanMovimientos()==false) {
				if(tablero.ganaJugador1()==false) {
					System.out.println("Introduzca movimiento (Jugador 2)");
					pos2=in.nextInt();
					while(tablero.movimientoValido(pos2)==false) {
						System.out.println("Movimiento no valido.Vuelve a ponerlo");
						pos2=in.nextInt();
					}
					tablero.mueveJugador2(pos2);
					tablero.DibujarTablero();
				}
			}
		}
		if(tablero.ganaJugador1()) {
			System.out.println("Ha ganado,Jugador 1");
		}else if(tablero.ganaJugador2()) {
			System.out.println("Ha ganado,Jugador 2");
		}else {
			System.out.println("La partida acaba en empate");
		}
		tablero.iniciar();
	}
	public static void jugadorVSmaquina() {
		int pos1;
		TresEnRaya tablero=new TresEnRaya();
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
		tablero.iniciar();
		while(tablero.ganaJugador1()==false && tablero.ganaJugador2()==false && tablero.quedanMovimientos()==false) {
			System.out.println("Introduzca movimiento (Jugador 1)");
			pos1=in.nextInt();
			while(tablero.movimientoValido(pos1)==false) {
				System.out.println("Movimiento no valido.Vuelve a ponerlo");
				pos1=in.nextInt();
			}
			tablero.mueveJugador1(pos1);
			tablero.DibujarTablero();
			if(tablero.quedanMovimientos()==false) {
				if(tablero.ganaJugador1()==false) {
					System.out.println("Turno de ordenador 2");
					tablero.mueveOrdenador2();
					tablero.DibujarTablero();
				}
			}
		}
		if(tablero.ganaJugador1()) {
			System.out.println("Ha ganado,Jugador 1");
		}else if(tablero.ganaJugador2()) {
			System.out.println("Ha ganado el ordenador");
		}else {
			System.out.println("La partida acaba en empate");
		}
		tablero.iniciar();
	}
	public static void maquinaVSmaquina() {
		TresEnRaya tablero=new TresEnRaya();
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
		tablero.iniciar();
		while(tablero.ganaJugador1()==false && tablero.ganaJugador2()==false && tablero.quedanMovimientos()==false) {
			System.out.println("Turno de ordenador 1");
			tablero.mueveOrdenador1();
			tablero.DibujarTablero();
			if(tablero.quedanMovimientos()==false) {
				if(tablero.ganaJugador1()==false) {
					System.out.println("Turno de ordenador 2");
					tablero.mueveOrdenador2();
					tablero.DibujarTablero();
				}
			}
		}
		if(tablero.ganaJugador1()) {
			System.out.println("Ha ganado,ordenador 1");
		}else if(tablero.ganaJugador2()) {
			System.out.println("Ha ganado,ordenador 2");
		}else {
			System.out.println("La partida acaba en empate");
		}
		tablero.iniciar();
	}

}
