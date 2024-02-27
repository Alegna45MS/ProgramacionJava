package Examen2Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String fecha;
		do {
			System.out.println("Escribe una fecha");
			fecha=in.nextLine();
			if(fechaValida(fecha)==false) {
				System.out.println("Fecha no valida");
			}
		}while(fechaValida(fecha)==false);
		System.out.println(cambiarFormatoFecha(fecha));
		
	}
	public static boolean fechaValida(String fecha) {
		String[] fecha_sep=fecha.split("/");
		int dia=Integer.parseInt(fecha_sep[0]);
		int mes=Integer.parseInt(fecha_sep[1]);
		int año=Integer.parseInt(fecha_sep[2]);
		int contBarra=0;
		if(fecha.length()==10) {
			for(int i=0;i<fecha.length();i++) {
				if(fecha.charAt(i)=='/') {
					contBarra++;
				}
			}
			if(contBarra!=2) {
				return false;
			}
			if(dia>31 && dia<1) {
				return  false;
			}else if(mes<1 && mes>12) {
				return false;
			}
		}
		return true;
		
	}
	public static String cambiarFormatoFecha(String fecha) {
		String[] fecha_sep=fecha.split("/");
		int dia=Integer.parseInt(fecha_sep[0]);
		int mes=Integer.parseInt(fecha_sep[1]);
		int año=Integer.parseInt(fecha_sep[2]);
		String mesNom;
		String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		for(int i=0;i<meses.length;i++) {
			if(mes==(i+1)) {
				mesNom=meses[i];
			}
		}
		return dia+" de "+mesNom+" de "+año;
		
	}

}
