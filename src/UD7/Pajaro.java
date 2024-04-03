package UD7;

public class Pajaro extends Animal {
	private boolean esCantor;

	public Pajaro(String nombre, String especie) {
		super(nombre, especie);
		this.esCantor = true;
	}


	public void dameFichaAnimal() {
		System.out.println("Pajaro:"+getNombre()+"-"+getEspecie()+"-"+esCantor);
	}
	
}
