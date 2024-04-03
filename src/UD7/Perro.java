package UD7;

public class Perro extends Animal {
	private boolean muerde;
	
	public Perro(String nombre, String especie) {
		super(nombre, especie);
		muerde=false;
	}
	public void dameFichaAnimal() {
		System.out.println("Perro:"+getNombre()+"-"+getEspecie());
		
	}

}
