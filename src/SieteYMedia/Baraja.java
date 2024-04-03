package SieteYMedia;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {
	private ArrayList<Carta> lista_cartas;
	
	public Baraja() {
		lista_cartas=new ArrayList<Carta>();
	}
	public Baraja(int tipoBaraja) {
		if(tipoBaraja==1) {
			lista_cartas=new ArrayList<Carta>(40);
			llenarBaraja(tipoBaraja);
		}
		if(tipoBaraja==2) {
			lista_cartas=new ArrayList<Carta>(80);
			llenarBaraja(tipoBaraja);
		}
	}
	public Baraja(int tipoBaraja,boolean barajar) {
		if(tipoBaraja==1) {
			lista_cartas=new ArrayList<Carta>(40);
			llenarBaraja(tipoBaraja);
		}
		if(tipoBaraja==2) {
			lista_cartas=new ArrayList<Carta>(80);
			llenarBaraja(tipoBaraja);
		}
		if(barajar==true) {
			Barajar();
		}
	}
	
	public int NumeroCartas() {
		int cont=0;
		for(int i=0;i<lista_cartas.size();i++) {
			cont++;
		}
		return cont;
	}
	public boolean estaVacia() {
		if(lista_cartas.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public void Barajar() {
		Random random=new Random();
		ArrayList<Carta> barajaAux=new ArrayList();
		while(lista_cartas.size()!=0) {
			int indice=random.nextInt(lista_cartas.size());
			barajaAux.add(lista_cartas.get(indice));
			lista_cartas.remove(indice);
		}
		for(int i=0;i<barajaAux.size();i++) {
			lista_cartas.add(barajaAux.get(i));
		}
	}
	public void Cortar(int posicion) {
		ArrayList<Carta> barajaAux=new ArrayList();
		for(int i=0;i<posicion;i++) {
			barajaAux.add(lista_cartas.get(i));
			lista_cartas.remove(i);
		}
		for(int i=0;i<barajaAux.size();i++) {
			lista_cartas.add(barajaAux.get(i));
		}
	}
	public Carta Robar() {
		Carta cartaRobada=lista_cartas.get(0);
		lista_cartas.remove(0);
		return cartaRobada;
	}
	public void insertarCartaFinal(int id_carta) {
		lista_cartas.add(new Carta(id_carta));
		
	}
	public void  insertarCartaPrincipio(int id_carta) {
		lista_cartas.add(0,new Carta(id_carta));
	}
	public void insertarCartaFinal(Carta c) {
		lista_cartas.add(c);
	}
	public void insertarCartaPrincipio(Carta c) {
		lista_cartas.add(0, c);
	}
	private void llenarBaraja(int tipoBaraja) {
		if(tipoBaraja==1) {
			for(int i=0;i<3;i++) {
				for(int j=1;i<=10;j++) {
					insertarCartaFinal(new Carta(i,j));
				}
			}
		}
		if(tipoBaraja==2) {
			for(int i=1;i<=40;i++) {
				insertarCartaFinal(new Carta(i));
			}
			for(int i=1;i<=40;i++) {
				insertarCartaFinal(new Carta(i));
			}
		}
	}
}
