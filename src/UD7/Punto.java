package UD7;

public class Punto extends Figura {
	private int x,y;
	public Punto(int x,int y) {
		super("Punto");
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public double obtenerArea() {
		return 0;
	}

	@Override
	public double obtenerVolumen() {
		return 0;
	}
}
