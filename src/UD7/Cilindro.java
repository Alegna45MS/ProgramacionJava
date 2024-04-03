package UD7;

public class Cilindro extends Figura {
	private double altura;
	private Circulo base;
	
	public Cilindro(double altura,Circulo base) {
		super("Cilindro");
		this.altura=altura;
		this.base=base;
	}
	
	public double getAltura() {
		return altura;
	}

	public Circulo getBase() {
		return base;
	}

	public double obtenerArea() {
		return 2*(base.obtenerArea())+2*Math.PI*base.getRadio()*altura;
	}
	public double obtenerVolumen() {
		return base.obtenerArea()*altura;
	}
}
