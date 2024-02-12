package UD6;

public class Regalo {
	private String nombre;
	private double precio;
	private String descripcion;
	
	public Regalo(String nombre,double precio,String descripcion) {
		this.nombre=nombre;
		this.precio=precio;
		this.descripcion=descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setNombre(String nNombre) {
		nombre=nNombre;
	}
	public void setPrecio(double nPrecio) {
		precio=nPrecio;
	}
	public void setDescripcion(String nDescripcion) {
		descripcion=nDescripcion;
	}
	public String toString() {
		return "Nombre:"+nombre+" Precio:"+precio+" Decripcion:"+descripcion;
	}
	
}
