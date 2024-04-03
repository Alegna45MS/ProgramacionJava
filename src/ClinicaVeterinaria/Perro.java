package ClinicaVeterinaria;

public class Perro extends Animal {
	private String microchip,raza;
	
	public Perro(String nombre, String fechaNacimiento,double peso,String raza,String microchip) {
		super(nombre,fechaNacimiento,peso);
		this.microchip=microchip;
		if(raza=="PastorAleman" || raza=="Husky" || raza=="FoxTerrier") {
			this.raza=raza;
		}
	}
	public String getMicrochip() {
		return microchip;
	}
	public String getRaza() {
		return raza;
	}
	public String dameDatosAnimal() {
		return "Ficha de perro"+"Nombre:"+super.getNombre()+"Raza:"+raza+"Fecha de Nacimiento:"+super.getFechaNacimiento()+"Peso:"+super.getPeso()+"Microchip:"+microchip+"Comentarios:"+super.getComentarios();
	}

}
