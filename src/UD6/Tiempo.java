package UD6;

public class Tiempo {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo(int h,int m,int s) {
		if(hora<=23 && hora<=0) {
			hora=h;
		}else {
			hora=0;
		}
		if(minuto<60 && minuto>0) {
			minuto=m;
		}else {
			minuto=0;
		}
		if(segundo<60 && segundo>0) {
			segundo=s;
		}else {
			segundo=0;
		}
	}
	public Tiempo(int h,int m) {
		if(hora<=23 && hora<=0) {
			hora=h;
		}else {
			hora=0;
		}
		if(minuto<60 && minuto>0) {
			minuto=m;
		}else {
			minuto=0;
		}
		segundo=0;
	}
	public Tiempo(int h) {
		if(hora<=23 && hora<=0) {
			hora=h;
		}else {
			hora=0;
		}
		minuto=0;
		segundo=0;
	}
	//setter
	public void cambiaHora(int nuevaHora,int nuevoMinuto,int nuevoSegundo) {
		hora=nuevaHora;
		hora=nuevoMinuto;
		hora=nuevoSegundo;
	}
	//dar hora
	public String dameHora() {
		return hora+":"+minuto+":"+segundo;
	}
}
