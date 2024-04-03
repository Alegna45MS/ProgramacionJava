package copy;

public class Carta {
	private int numero;
	private int palo;
	
	public Carta(int numero, int palo) {
		this.numero = numero;
		this.palo = palo;
	}
	public Carta(int id) {
		if(id>0 && id<41) {
			this.numero = (id - 1) % 10 + 1;
		}
		
        this.palo = (id - 1) / 10;
	}
	public int getNumero() {
		return numero;
	}
	public int getPalo() {
		return palo;
	}
	public String NombreNumero() {
		String[] nombres = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
        return nombres[numero - 1];
	}
	public String NombrePalo() {
		String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        return palos[palo];
	}
	public String NombreCarta() {
		return NombreNumero()+" de "+NombrePalo();
	}
	public double Valor7yMedia() {
		if(numero>=8) {
			return 0.5;
		}else {
			return numero;
		}
	}
	public int ValorTute() {
		 if (numero == 1) {
			 return 11;
		 }
	        if (numero == 3) {
	        	return 10;
	        }
	        if (numero >= 8) {
	        	return 4;
	        }
	        return 0;
	}
	public int ValorMus() {
		if (numero == 1 || numero == 2) {
			return 1;
		}
        if (numero == 3 || numero >= 8) {
        	return 10;
        }
        return numero;
	}
	
}
