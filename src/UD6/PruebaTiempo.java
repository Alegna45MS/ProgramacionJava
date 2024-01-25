package UD6;

public class PruebaTiempo {

	public static void main(String[] args) {
		Tiempo hora1 = new Tiempo(22,59,59);
		System.out.println("Hora actual="+hora1.dameHora());
		hora1.aumentaUnSegundo();
		System.out.println(hora1.dameHora());
		
		

	}

}
