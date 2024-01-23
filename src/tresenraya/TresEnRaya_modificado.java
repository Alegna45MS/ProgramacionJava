package tresenraya;

import java.util.Scanner;

public class TresEnRaya_modificado {
	static Scanner in = new Scanner(System.in);
	static char[] tablero = new char[9];
	public static void main(String[] args) {
		int opcion='0';
		int gana1=0,gana2=0,empate=0;
		int pos1,pos2;
		
		do {
			Mostrar_menu();
			System.out.println("Seleccione una opción:");
			//Introducimos la opcion del menu
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("-------------");
				System.out.println("| 1 | 2 | 3 |");
				System.out.println("-------------");
				System.out.println("| 4 | 5 | 6 |");
				System.out.println("-------------");
				System.out.println("| 7 | 8 | 9 |");
				System.out.println("-------------");
				iniciar(); //Rellenar el array a ' '
				//Mientras que ni el jugador 1 ni el 2 hayan ganado y sigan habiendo posiciones libres
				while(ganaJugador1()==false&& ganaJugador2()==false&&quedanCasillas()==false) {
					System.out.println("Introduzca movimiento(jugador 1)");
					//Introducimos la posicion
					pos1=in.nextInt();
					//Una vez introducido la posicion,vemos si es valida
					while(movimientoValido(pos1)==false) {
						//Si no es valida,lo volvemos a pedir hasta que sea correcta
						System.out.println("Movimiento no valido.Vuelve a ponerlo");
						pos1=in.nextInt();
					}mueveJugador1(pos1);
					dibujaTablero(); //Dibujamos el tablero para ver donde está la 'X'
					if (quedanCasillas()==false){ //Antes de que juegue jugador 2,vemos si sigue habiendo posiciones libres
					if (ganaJugador1()==false){ //Si jugador 1 ya ha ganado,jugador 2 no juega mas
						System.out.println("Introduzca movimiento(jugador 2)");
						pos2=in.nextInt();
						//Una vez introducido la posicion,vemos si es valida
						while(movimientoValido(pos2)==false) {
							//Si no es valida,lo volvemos a pedir hasta que sea correcta
							System.out.println("Movimiento no valido.Vuelve a ponerlo");
							pos2=in.nextInt();
						}	mueveJugador2(pos2);
							dibujaTablero();//Dibujamos el tablero para ver donde está la 'X'
					}
				  }
					
				}
				muestraResultado();
				if (ganaJugador1()==true){
					gana1=gana1+1;
				}else if (ganaJugador2()==true){
					gana2=gana2+1;
				}else{
					empate=empate+1;
				}
				{
		}
			break;
			case 2:
				System.out.println("Cantidad de partidas ganadas y empates:");
				System.out.println("Partidas ganadas del Jugador 1:"+gana1);
				System.out.println("Partidas ganadas del Jugador 2:"+gana2);
				System.out.println("Partidas acabadas en empate:"+empate);
				System.out.println(" ");
			break;
			case 3:
				System.out.println("Salir");
			break;
			default:
				System.out.println("Opcion invalida");
			}
		}while (opcion!=3);{
		}
	}
	public static void Mostrar_menu() {
		System.out.println("1.Jugar una partida");
		System.out.println("2.Mostrar estadisticas");
		System.out.println("3.Salir");
	}
	public static void dibujaTablero() {
		System.out.println("-------------");
		System.out.println("| "+tablero[0]+" | "+tablero[1]+" | "+tablero[2]+" | ");
		System.out.println("-------------");
		System.out.println("| "+tablero[3]+" | "+tablero[4]+" | "+tablero[5]+" | ");
		System.out.println("-------------");
		System.out.println("| "+tablero[6]+" | "+tablero[7]+" | "+tablero[8]+" | ");
		System.out.println("-------------");
	}
	public static void iniciar() { //Iniciamos el tablero a posiciones vacias
		for (int i=0;i<9;i++) {
			tablero[i]=' ';
		}

	}
	public static void mueveJugador1(int pos) {
		tablero[pos-1]='X'; 
	}
	public static void mueveJugador2(int pos) {
		tablero[pos-1]='O';
	}
	public static boolean movimientoValido(int pos) {
		return (pos > 0 && pos <= 9 && tablero[pos-1] != 'X'&& tablero[pos-1] != 'O');
		//True si pos es mayor que 0 y menor igual a 9 y la posicion del tablero tiene que ser diferente de X y O
	}
	public static boolean quedanCasillas() { 
		for(int i=0;i<9;i++) {
			if (tablero[i]!='X'&&tablero[i]!='O') {
				return false; //Todavia hay casillas libres
			}
		}
		return true; //Todas las casillas están ocupadas
	}
	public static boolean ganaJugador1() { 
		if (verificarFilas('X')||verificarColumnas('X')||verificarDiagonales('X')) {
			return true;
		}
		return false;
	}
	public static boolean ganaJugador2() {
		if (verificarFilas('O')||verificarColumnas('O')||verificarDiagonales('O')) {
			return true;
		}
		return false;
	}
	public static boolean verificarFilas(char icono) {
		boolean ganar=false;
		if(tablero[0]==icono && tablero[1]==icono && tablero[2]==icono) {
			ganar=true;
		}else if(tablero[3]==icono && tablero[4]==icono && tablero[5]==icono) {
			ganar=true;
		}else if(tablero[6]==icono && tablero[7]==icono && tablero[8]==icono) {
			ganar=true;
		}
		return ganar;
	}
	public static boolean verificarColumnas(char icono) {
		boolean ganar=false;
		if(tablero[0]==icono && tablero[3]==icono && tablero[6]==icono) {
			ganar=true;
		}else if(tablero[1]==icono && tablero[4]==icono && tablero[7]==icono) {
			ganar=true;
		}else if(tablero[2]==icono && tablero[5]==icono && tablero[8]==icono) {
			ganar=true;
		}
		return ganar;
	}
	public static boolean verificarDiagonales(char icono) {
		boolean ganar=false;
		if(tablero[0]==icono && tablero[4]==icono && tablero[8]==icono) {
			ganar=true;
		}else if(tablero[2]==icono && tablero[4]==icono && tablero[6]==icono) {
			ganar=true;
		}
		return ganar;
	}
	public static boolean esEmpate() {
			if (ganaJugador1()==true || ganaJugador2()==true) {
				return false; //Uno de los dos ganó,no hay empate
			}
		return true; //Todas las casillas están ocupadas y nadie ganó,entonces es empate
		
	}
	public static void muestraResultado() {
		if (ganaJugador1()==true) {
			System.out.println("Ha Ganado el Jugador 1!");
		}if (ganaJugador2()==true) {
			System.out.println("Ha Ganado el Jugador 2!");
		}
		if (esEmpate()==true) {
			System.out.println("¡El juego ha terminado en empate!");
		}
		
	}

}
