package UD7;

public class Electrodomesticos {
	private String color;
	private double precio;
	private char consumEnergetico;
	private double peso;
	
	public Electrodomesticos(){
		color="blanco";
		consumEnergetico='F';
		precio=100;
		peso=5;
	}
	public Electrodomesticos(double precio,double peso) {
		color="blanco";
		consumEnergetico='F';
		this.precio=precio;
		this.peso=peso;
	}
	public Electrodomesticos(String color,double precio,char consumo,double peso) {
		if(comprobarColor(color)) {
			this.color=color;
		}
		this.precio=precio;
		if(comprobarConsumoEnergetico(consumo)) {
			this.consumEnergetico=consumo;
		}
		this.peso=peso;
	}
	public String getColor() {
		return color;
	}
	public double getPrecio() {
		return precio;
	}
	public char getConsumEnergetico() {
		return consumEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public boolean comprobarConsumoEnergetico(char letra) {
		if(letra>='A' && letra<='F') {
			return true;
		}else {
			this.consumEnergetico='F';
			return false;
		}
	}
	public boolean comprobarColor(String color) {
		if(color=="blanco" || color=="negro" || color=="rojo" || color=="azul" || color=="gris") {
			return true;
		}else {
			this.color="blanco";
			return false;
		}
	}
	public void precioFinal() {
		
	}
}
