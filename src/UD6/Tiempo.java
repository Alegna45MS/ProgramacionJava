package UD6;

public class Tiempo {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo(int h,int m,int s) {
		if((h>0) && (h<=23)) {
			hora=h;
		}else {
			hora=0;
		}
		if((m>0) && (m<60)) {
			minuto=m;
		}else {
			minuto=0;
		}
		if((s>0) && (s<60)) {
			segundo=s;
		}else {
			segundo=0;
		}
	}
	public Tiempo(int h,int m) {
		if(h<=23 && h>0) {
			hora=h;
		}else {
			hora=0;
		}
		if(m<60 && m>0) {
			minuto=m;
		}else {
			minuto=0;
		}
		segundo=0;
	}
	public Tiempo(int h) {
		if(h<=23 && h>0) {
			hora=h;
		}else {
			hora=0;
		}
		minuto=0;
		segundo=0;
	}
	//setter
	public void cambiaHora(int nuevaHora,int nuevoMinuto,int nuevoSegundo) {
		if(nuevaHora>0 && nuevaHora<=23) {
			hora=nuevaHora;
		}else {
			hora=0;
		}
		if( nuevoMinuto>0 && nuevoMinuto<60) {
			minuto=nuevoMinuto;
		}else {
			minuto=0;
		}
		if( nuevoSegundo>0 && nuevoSegundo<60) {
			segundo=nuevoSegundo;
		}else {
			segundo=0;
		}
	}
	public void aumentaUnSegundo() {
		segundo=segundo+1;
		if(segundo==60) {
			segundo=0;
			minuto=minuto+1;
		}if(minuto==60) {
			minuto=0;
			hora=hora+1;
		}if(hora==24) {
			hora=0;
		}
	}
	//dar hora
	public String dameHora() {
		return hora+":"+minuto+":"+segundo;
	}
}
