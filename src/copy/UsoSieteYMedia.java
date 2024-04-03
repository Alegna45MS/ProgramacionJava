package copy;

import java.util.Random;
import java.util.Scanner;

public class UsoSieteYMedia {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random random=new Random();
		double cont = 0,cont2=0;
		int opcion2;
		boolean plantar=false;
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
				System.out.println("Roba carta(1) o se planta(2)?");
				opcion2=random.nextInt(2)+1;
				if(opcion2==1) {
					System.out.println("La banca se planta");
					plantar=true;
				}
				}
			if(cont==7.5 || (cont<7.5 && cont>cont2)) {
				System.out.println("Has ganado!!!!");
			}else {
				System.out.println("Perdiste.Ganó la banca");
				
		}
	}

}
