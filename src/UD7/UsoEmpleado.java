package UD7;

public class UsoEmpleado {

	public static void main(String[] args) {
		Comercial comercial=new Comercial("123a","Maria",2000,1000);
		System.out.println("nombre:"+comercial.getNombre()+" "+"Sueldo:"+comercial.getSueldo());
		
		Tecnico tecnico=new Tecnico("234b","Manu",2500,"Java");
		System.out.println(tecnico.getNombre()+tecnico.getSueldo());

	}

}
