package Carrito;

public class Producto {
	private int cod_producto;
	private String nombre_producto;
	private int stock;
	
	public Producto(int codigo,String nombre,int unidades) {
		this.cod_producto=codigo;
		this.nombre_producto=nombre;
		this.stock=unidades;
	}

	public int getCod_producto() {
		return cod_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public int getStock() {
		return stock;
	}
	public String toString() {
		return "cod_producto=" + cod_producto + ", nombre_producto=" + nombre_producto + ", stock=" + stock;
	}
	
}
