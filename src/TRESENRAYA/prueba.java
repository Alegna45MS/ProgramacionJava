package TRESENRAYA;

public class prueba {

	public static void main(String[] args) {
		InicioSesion inicio = new InicioSesion();
		Menu menu = new Menu();
		Estadisticas estats = new Estadisticas();
		
		inicio.setMenu(menu);
		menu.setInicio(inicio);
		menu.setEstadisticas(estats);
		estats.setMenu(menu);
	}

}
