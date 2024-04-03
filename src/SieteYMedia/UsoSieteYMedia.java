package SieteYMedia;

import java.util.Random;
import java.util.Scanner;

public class UsoSieteYMedia {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random random=new Random();
		double cont = 0,cont2=0;
		int opcion1,opcion2;
		int tipoBaraja=0;
		boolean barajar=true;
		boolean plantar=false;
		System.out.println("Desea jugar al 7 y medio(s/n)?");
		do {
			opcion1=in.nextLine().charAt(0);
			switch(opcion1) {
			case 's':
			case 'S':
				System.out.println("Bienvenido al 7 y medio");
				System.out.println("Primero que nada,escoge el tipo de baraja:40(1) u 80(2) cartas");
				while (tipoBaraja!=1 && tipoBaraja!=2) {
					tipoBaraja=in.nextInt();
					if(tipoBaraja!=1 && tipoBaraja!=2) {
						System.out.println("Opcion no valida.Vuelve a ponerlo");
					}
				}
				Baraja baraja=new Baraja(tipoBaraja,barajar);
				while(cont<7.5 && plantar==false) {
					Carta cartaRobada=baraja.Robar();
					System.out.println(cartaRobada.NombreNumero());
					cont=cont+cartaRobada.Valor7ymedia();
					System.out.println("Puntuacion:"+cont);
					System.out.println("Roba carta(1) o se planta(2)?");
					opcion2=in.nextInt();
					while(opcion2!=1 && opcion2!=2) {
						System.out.println("Opcion no valida.Vuelve a ponerlo");
						opcion2=in.nextInt();
					}
					if(opcion2==2) {
						plantar=true;
					}
				}
				System.out.println("Le toca a la banca");
				while(cont<7.5 && plantar==false) {
					Carta cartaRobada=baraja.Robar();
					System.out.println(cartaRobada.NombreNumero());
					cont2=cont2+cartaRobada.Valor7ymedia();
					System.out.println("Puntuacion:"+cont);
					opcion2=random.nextInt(2);
					if(opcion2==1) {
						plantar=true;
					}
				}
				if(cont>7.5 || cont2>cont) {
					System.out.println("Perdiste.Ganó la banca");
				}else {
					System.out.println("Has ganado!!!!");
				}
			case 'n':
			case 'N':
				System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion1!='n' && opcion1!='N');
		
		
	}

}
