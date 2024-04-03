package ClinicaVeterinaria;

public class Reptil extends Animal {
	private String especie;
	private boolean venenoso;
	
	public Reptil(String nombre, String fechaNacimiento,double peso,String especie,boolean venenoso) {
		super(nombre,fechaNacimiento,peso);
		this.venenoso=venenoso;
		if(especie=="Tortuga" || especie=="Iguana" || especie=="DragonDeComodo") {
			this.especie=especie;
		}
	}
	
	public String getEspecie() {
		return especie;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public String dameDatosAnimal() {
		return "Ficha de reptil"+"Nombre:"+super.getNombre()+"Especie:"+especie+"Fecha de Nacimiento:"+super.getFechaNacimiento()+"Peso:"+super.getPeso()+"kg "+"¿Es venenoso?:"+venenoso+"Comentarios:"+super.getComentarios();
	}
}
