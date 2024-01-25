package Ejercicos_profesor;

public class Tiempo {
	//definimos atributos
	private int hora,minuto,segundo;
	
	//constructores
	public Tiempo(int h,int m,int s) {
		cambiaHora(h,m,s);
	}
	public Tiempo(int h,int m) {
		cambiaHora(h,m,0);
	}
	public Tiempo(int h) {
		cambiaHora(h,0,0);
	}
	//setter
	public void cambiaHora(int h,int m,int s) {
		if ((h>=0)&&(h<=23)) 
			hora=h;
		else
			hora=0;
		
		if ((m>=0)&&(m<=59)) 
			minuto=m;
		else
			minuto=0;
		
		if ((s>=0)&&(s<=59)) 
			segundo=s;
		else
			segundo=s;
	}
	//getters
	public String dameHora() {
		return hora+":"+minuto+":"+segundo;
	}
	
}
