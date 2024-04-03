package copy;

import java.util.Random;
import java.util.Scanner;

public class UsoSieteYMediaaaaa {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random random=new Random();
		double cont = 0,cont2=0;
		int opcion1,opcion2;
		boolean plantar=false;
		System.out.println("Desea jugar al 7 y medio(s/n)?");
		opcion1=in.nextLine().charAt(0);
		do {
			switch(opcion1) {
			case 's':
			case 'S':
				System.out.println("Bienvenido al 7 y medio");
				Baraja baraja=new Baraja(1,true);
				while(cont<7.5 && plantar==false) {
					Carta cartaRobada=baraja.Robar();
					System.out.println("Has robado un:"+cartaRobada.NombreCarta());
					cont=cont+cartaRobada.Valor7yMedia();
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
				plantar=false;
				System.out.println("Le toca a la banca");
				while(cont2<7.5 && plantar==false) {
					Carta cartaRobada=baraja.Robar();
					System.out.println(cartaRobada.NombreCarta());
					cont2=cont2+cartaRobada.Valor7yMedia();
					System.out.println("Puntuacion:"+cont2);
					opcion2=random.nextInt(2)+1;
					if(opcion2==1) {
						plantar=true;
					}
				}
				if(cont>7.5 || cont2>cont) {
					System.out.println("Perdiste.Ganó la banca");
				}else {
					System.out.println("Has ganado!!!!");
				}
				System.out.println("Quieres jugar otra vez(s/n)?");
				opcion1=in.nextLine().charAt(0);
			break;
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
