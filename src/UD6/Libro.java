package UD6;

public class Libro {
	private String titulo;
	private String autor;
	private int numPag;
	private double calif;
	
	public Libro(String titulo,String autor,int numPag,double calif) {
		this.titulo=titulo;
		this.autor=autor;
		this.numPag=numPag;
		this.calif=calif;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int numPag() {
		return numPag;
	}
	public double getCalif() {
		return calif;
	}
	public void setTitulo(String ntitulo) {
		titulo=ntitulo;
	}
	public void setAutor(String nAutor) {
		autor=nAutor;
	}
	public void setNumPag(int nPag) {
		if (nPag>0) {
			numPag=nPag;
		}
		
	}
	public void setCalif(double nCalif) {
		if(nCalif>=0 && nCalif<=10) {
			calif=nCalif;
		}
	}
}
