package ClinicaVeterinaria;

public class Pajaro extends Animal{
	private String especie;
	private boolean cantor;
	
	public Pajaro(String nombre, String fechaNacimiento,double peso,String especie,boolean cantor) {
		super(nombre,fechaNacimiento,peso);
		if(especie=="Periquito" || especie=="Agaporni" || especie=="Canario") {
			this.especie=especie;
		}
		this.cantor=cantor;
	}
	
	public String getEspecie() {
		return especie;
	}

	public boolean isCantor() {
		return cantor;
	}

	public String dameDatosAnimal() {
		return "Ficha de pajaro"+"Nombre:"+super.getNombre()+"Especie:"+especie+"Fecha de Nacimiento:"+super.getFechaNacimiento()+"Peso:"+super.getPeso()+"¿Es cantor?:"+cantor+"Comentarios:"+super.getComentarios();
	}
}
