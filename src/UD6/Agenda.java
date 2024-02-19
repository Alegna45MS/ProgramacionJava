package UD6;

public class Agenda {
	private Contacto[] contactos;
	private int tamaño=10;
	private int cantidad;
	
	public Agenda() {
		this.contactos=new Contacto[tamaño];
		cantidad=0;
	}
	public Agenda(int tamaño) {
		this.contactos=new Contacto[tamaño];
	}
	public void añadirContacto(Contacto contacto) {
		if(cantidad<tamaño) {
			if(!existeContacto(contacto)) {
				contactos[cantidad]=contacto;
				cantidad++;
			}else {
				System.out.println("No se pueden repetir nombres");
			}
		}else {
			System.out.println("La lista de contactos esta llena");
		}
	}
	public boolean existeContacto(Contacto contacto) {
		for(int i=0;i<cantidad;i++) {
			if(contactos[i].getNombre()==contacto.getNombre()) {
				return true;
			}
		}
		System.out.println("Contacto no encontrado");
		return false;
	}
	public void listarContactos() {
		for(int i=0;i<cantidad;i++) {
			System.out.println("Nombre: "+contactos[i].getNombre());
			System.out.println("Telefono: "+contactos[i].getTlf());
		}
	}
	public void buscarContacto(String nombre) {
		boolean encontrado=false;
		while(encontrado==false) {
		for(int i=0;i<cantidad;i++) {
			if(contactos[i].getNombre().equals(nombre)==true) {
				System.out.println("Telefono: "+contactos[i].getTlf());
			}
		}
		}
	}
	
	
	
}
