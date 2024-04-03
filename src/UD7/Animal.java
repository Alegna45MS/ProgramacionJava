package UD7;
//Es una clase abstracta ya que tiene al menos un metodo abstracto
public abstract class Animal {
	private String nombre,especie;

	public Animal(String nombre, String especie) {
		this.nombre = nombre;
		this.especie = especie;
	}
	//metodo abstracto,solo definimos el cuerpo
	public abstract void dameFichaAnimal();
	
	public String getNombre() {
		return nombre;
	}
	public String getEspecie() {
		return especie;
	}
	
	
}
