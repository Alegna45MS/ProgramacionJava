package UD4;

public class Hoja4_Ejercicio15 {
//Que pinte un tablero de ajedrez, los peones con la letra P, las torres con T, los
//caballos con C, los alfiles con A, el rey con R y la reina con M
	public static void main(String[] args) {
		char[][]tablero=new char[8][8];

	}
	public static void rellenarArray(int[][]tablero) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<8;j++) {
				if(i==1) {
					tablero[i][j]='P';
				}
				
			}
		}
		
	}
}
