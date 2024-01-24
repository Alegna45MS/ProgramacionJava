package UD6;

public class PruebaTiempo {

	public static void main(String[] args) {
		Tiempo hora1 = new Tiempo(22,45,20);
		System.out.println("Hora actual="+hora1.dameHora());
		hora1.cambiaHora(11,34,12);
		System.out.println("Hora cambiada="+hora1.dameHora());

	}

}
