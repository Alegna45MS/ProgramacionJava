package UD7.Ejercicio4;

public class PruebaEmpleado {

	public static void main(String[] args) {
		EmpleadoPorComision e1=new EmpleadoPorComision("Carlos","Mancheno",1234,5,500.5);
		EmpleadoPorComision e2=new EmpleadoPorComision("Pedro","Sanchez",5678,9,200.25);
		EmpleadoBaseMasComision e3=new EmpleadoBaseMasComision("Ana","Martinez",9876,2000,8,300);
		EmpleadoBaseMasComision e4=new EmpleadoBaseMasComision("Maria","Perez",6666,5000,2,50);
		
		System.out.println(e1.getNombre()+" "+e1.getApellido()+" "+e1.getSalario());
		System.out.println(e2.getNombre()+" "+e2.getApellido()+" "+e2.getSalario());
		System.out.println(e3.getNombre()+" "+e3.getApellido()+" "+e3.getSalario());
		System.out.println(e4.getNombre()+" "+e4.getApellido()+" "+e4.getSalario());
	}

}
