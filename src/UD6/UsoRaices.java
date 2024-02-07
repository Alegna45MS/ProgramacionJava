package UD6;

import java.util.Scanner;

public class UsoRaices {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("Introduce los valores de a,b y c");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		Raices r1=new Raices(a,b,c);
		r1.obtenerRaices();
		r1.obtenerRaiz();

	}

}
