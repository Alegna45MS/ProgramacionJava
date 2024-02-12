package UD6;

public class Pareja {
	private Persona persona1;
	private Persona persona2;
	private Regalo regaloParaPersona1;
	private Regalo regaloParaPersona2;
	
	public Pareja(Persona p1,Persona p2) {
		persona1=p1;
		persona2=p2;
		regaloParaPersona1=null;
		regaloParaPersona2=null;
	}
	public void setRegaloParaPersona1(Regalo regalo) {
		regaloParaPersona1=regalo;	
	}
	public void setRegaloParaPersona2(Regalo regalo) {
		regaloParaPersona2=regalo;
	}
	public double calcularCostoTotal() {
		double total=regaloParaPersona1.getPrecio()+regaloParaPersona2.getPrecio();
		return total;
	}
	public void mostrarDetalles() {
		System.out.println("Regalo para persona 1");
		System.out.println(regaloParaPersona1.toString());
		System.out.println("Regalo para persona 2");
		System.out.println(regaloParaPersona2.toString());
		System.out.println("En total se han gastado: "+calcularCostoTotal());
	}
	public String toString() {
		return persona1.toString()+" Regalo para persona 1:"+regaloParaPersona1.toString()+persona2.toString()+"Regalo para persona 2:"+regaloParaPersona2.toString();
	}
}

