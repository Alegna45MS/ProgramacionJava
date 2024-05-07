package TresEnRayaVentana;

public class Tablero extends VentanaTresEnRaya{
	private int[] tablero;
	private boolean esTurnoJugador1;
	private VentanaTresEnRaya ventana;
	
	public Tablero() {
		tablero=new int[9];
		esTurnoJugador1=true;
	}
	public boolean quedanCasillas() {
		for(int i=0;i<9;i++) {
			if (tablero[i]==0)
				return true; 
		}
		return false;
	}
	public boolean casillaVacia(int pos) {
		if (tablero[pos]==0)
			return true;
		
		return false;
	}
	public boolean ganaJugador(int jugador) {
		//columnas
		for(int i=0;i<3;i++) {
			if ((tablero[i]==jugador)&&(tablero[3+i]==jugador)
				&&(tablero[6+i]==jugador)){
				return true;
			}
		}
		//filas
		for(int i=0;i<9;i=i+3) {
			if ((tablero[i]==jugador)&&(tablero[1+i]==jugador)
					&&(tablero[2+i]==jugador)){
					return true;
				}
		}
		//diagonal
		if ((tablero[0]==jugador) && (tablero[4]==jugador)&& 
				(tablero[8]==jugador))
			return true;
		if ((tablero[2]==jugador) && (tablero[4]==jugador)&& 
				(tablero[6]==jugador))
			return true;
			
		return false;
	}
}
