package ClinicaVeterinaria;

public class Gato extends Animal{
private String microchip,raza;
	
	public Gato(String nombre, String fechaNacimiento,double peso,String raza,String microchip) {
		super(nombre,fechaNacimiento,peso);
		this.microchip=microchip;
		if(raza=="Comun" || raza=="Siames" || raza=="Persa" || raza=="Angora" || raza=="ScottishFold") {
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
		return "Ficha de gato"+"Nombre:"+super.getNombre()+"Raza:"+raza+"Fecha de Nacimiento:"+super.getFechaNacimiento()+"Peso:"+super.getPeso()+"Microchip:"+microchip+"Comentarios:"+super.getComentarios();
	}
}
