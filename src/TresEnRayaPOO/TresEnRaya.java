package TresEnRayaPOO;

import java.util.Random;

public class TresEnRaya {
	static Random random=new Random();
	private int[][] casillas;
	
	public TresEnRaya() {
		casillas=new int[3][3];
	}
	public void mueveJugador1(int pos) {
		if(pos==1) {
			casillas[0][0]=1;
		}else if(pos==2) {
			casillas[0][1]=1;
		}else if(pos==3) {
			casillas[0][2]=1;
		}else if(pos==4) {
			casillas[1][0]=1;
		}else if(pos==5) {
			casillas[1][1]=1;
		}else if(pos==6) {
			casillas[1][2]=1;
		}else if(pos==7) {
			casillas[2][0]=1;
		}else if(pos==8) {
			casillas[2][1]=1;
		}else{
			casillas[2][2]=1;
		}
	}
	public void mueveJugador2(int pos) { 
		if(pos==1) {
			casillas[0][0]=2;
		}else if(pos==2) {
			casillas[0][1]=2;
		}else if(pos==3) {
			casillas[0][2]=2;
		}else if(pos==4) {
			casillas[1][0]=2;
		}else if(pos==5) {
			casillas[1][1]=2;
		}else if(pos==6) {
			casillas[1][2]=2;
		}else if(pos==7) {
			casillas[2][0]=2;
		}else if(pos==8) {
			casillas[2][1]=2;
		}else{
			casillas[2][2]=2;
		}
	}
	public boolean movimientoValido(int pos) {
		if(pos>=1 && pos<=9) {
			if(pos==1) {
				if(casillas[0][0]==0) {
					return true;
				}
			}else if(pos==2) {
				if(casillas[0][1]==0) {
					return true;
				}
			}else if(pos==3) {
				if(casillas[0][2]==0) {
					return true;
				}
			}else if(pos==4) {
				if(casillas[1][0]==0) {
					return true;
				}
			}else if(pos==5) {
				if(casillas[1][1]==0) {
					return true;
				}
			}else if(pos==6) {
				if(casillas[1][2]==0) {
					return true;
				}
			}else if(pos==7) {
				if(casillas[2][0]==0) {
					return true;
				}
			}else if(pos==8) {
				if(casillas[2][1]==0){
					return true;
				}
			}else{
				if(casillas[2][2]==0) {
					return true;
				};
			}
		}
		return false;
	}
	public void mueveOrdenador1() {
		boolean valido=false;
		do {
			int posx=random.nextInt(3);
			int posy=random.nextInt(3);
			if(movimientoValidoOrdenador(posx,posy)==true) {
				casillas[posx][posy]=1;
				valido=true;
			}
		}while(valido==false);

	}
	public void mueveOrdenador2() {
		boolean valido=false;
		do {
			int posx=random.nextInt(3);
			int posy=random.nextInt(3);
			if(movimientoValidoOrdenador(posx,posy)==true) {
				casillas[posx][posy]=2;
				valido=true;
			}
		}while(valido==false);
	}
	public boolean movimientoValidoOrdenador(int posx,int posy) {
		if(casillas[posx][posy]==0) {
			return true;
		}
		return false;
	}
	public void iniciar() {
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				casillas[i][j]=0;
			}
	}
  }
	public boolean quedanMovimientos() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (casillas[i][j]==0 ) {
					return false; //Todavia hay casillas libres
			}
			}
		}
		return true;
	}
	public boolean ganaJugador1() {
		if (verificarFilas(1)||verificarColumnas(1)||verificarDiagonales(1)) {
			return true;
		}
		return false;
	}
	public boolean ganaJugador2() {
		if (verificarFilas(2)||verificarColumnas(2)||verificarDiagonales(2)) {
			return true;
		}
		return false;
	}
	public void DibujarTablero() {
		System.out.println("-------------");
		System.out.println("| "+casillas[0][0]+" | "+casillas[0][1]+" | "+casillas[0][2]+" | ");
		System.out.println("-------------");
		System.out.println("| "+casillas[1][0]+" | "+casillas[1][1]+" | "+casillas[1][2]+" | ");
		System.out.println("-------------");
		System.out.println("| "+casillas[2][0]+" | "+casillas[2][1]+" | "+casillas[2][2]+" | ");
		System.out.println("-------------");
	}
	public boolean verificarFilas(int icono) {
		boolean ganar=false;
		if(casillas[0][0]==icono && casillas[0][1]==icono && casillas[0][2]==icono) {
			ganar=true;
		}else if(casillas[1][0]==icono && casillas[1][1]==icono && casillas[1][2]==icono) {
			ganar=true;
		}else if(casillas[2][0]==icono && casillas[2][1]==icono && casillas[2][2]==icono) {
			ganar=true;
		}
		return ganar;
	}
	public boolean verificarColumnas(int icono) {
		boolean ganar=false;
		if(casillas[0][0]==icono && casillas[1][0]==icono && casillas[2][0]==icono) {
			ganar=true;
		}else if(casillas[0][1]==icono && casillas[1][1]==icono && casillas[2][1]==icono) {
			ganar=true;
		}else if(casillas[0][2]==icono && casillas[1][2]==icono && casillas[2][2]==icono) {
			ganar=true;
		}
		return ganar;
	}
	public boolean verificarDiagonales(int icono) {
		boolean ganar=false;
		if(casillas[0][0]==icono && casillas[1][1]==icono && casillas[2][2]==icono) {
			ganar=true;
		}else if(casillas[0][2]==icono && casillas[1][1]==icono && casillas[2][0]==icono) {
			ganar=true;
		}
		return ganar;
	}
	public boolean esEmpate() {
			if (ganaJugador1()==true || ganaJugador2()==true) {
				return false; //Uno de los dos ganó,no hay empate
			}
		return true;
		
	}
}
