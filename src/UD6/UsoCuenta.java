package UD6;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoCuenta {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int opcion=0;
		ArrayList<Cuenta>listCuenta=new ArrayList<Cuenta>();
		do {
			System.out.println("1.Añadir cuenta");
			System.out.println("2.Eliminar cuenta");
			System.out.println("3.Listar cuenta por titular");
			System.out.println("4.Salir");
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				Cuenta c1=dameCuenta();
				listCuenta.add(c1);
			break;
			case 2:
				System.out.println("Introduce posicion a eliminar");
				int pos=Integer.parseInt(in.nextLine());
				if(listCuenta.size()>pos) {
					listCuenta.remove(pos);
				}
				/*System.out.println("Escribe el titular de la cuenta a eliminar");
				String titular=in.nextLine();
				in.nextLine();
				for(int i=0;i<listCuenta.size();i++) {
					if(listCuenta.get(i).dameTitular().equals(titular)) {
						listCuenta.remove(i);
					}
				}*/
			break;
			case 3:
				System.out.println("Escribe el titular de las cuentas que quieres listar");
				String titular=in.nextLine();
				in.nextLine();
				for(int i=0;i<listCuenta.size();i++) {
					if(listCuenta.get(i).dameTitular().equals(titular)) {
						System.out.println(listCuenta.get(i).dameCuenta());
					}
				}
			break;
			case 4:
				System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion!=4);
	}
	public static Cuenta dameCuenta() {
		System.out.println("Escribe el titular de la cuenta");
		String titular=in.nextLine();
		in.nextLine();
		System.out.println("Escribe la cantidad");
		double cantidad=Double.parseDouble(in.nextLine());
		return new Cuenta(titular,cantidad);
	}
}


