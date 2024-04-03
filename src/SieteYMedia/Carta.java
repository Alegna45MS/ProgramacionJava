package SieteYMedia;

public class Carta {
	private int numero;
	private int palo;
	
	public Carta(int numero, int palo) {
		this.numero = numero;
		this.palo = palo;
	}
	public Carta(int id) {
		if(id>0 && id<41) {
			numero=id;
		}
		palo=0;
	}
	public int getNumero() {
		return numero;
	}
	public int getPalo() {
		return palo;
	}
	public String NombreNumero() {
		switch(getNumero()) {
		case 1:
			return "As";
		case 2:
			return "Dos";
		case 3:
			return "Tres";
		case 4:
			return "Cuatro";
		case 5:
			return "Cinco";
		case 6:
			return "Seis";
		case 7:
			return "Siete";
		case 8:
			return "Sota";
		case 9:
			return "Caballo";
		case 10:
			return "Rey";
		}
	return "0";
	}
	public String NombrePalo() {
		switch(getPalo()) {
		case 0:
			return "oros";
		case 1:
			return "espadas";
		case 2:
			return "copas";
		case 3:
			return "bastos";
		}
		return "0";
	}
	public String NombreCarta() {
		return NombreNumero()+"de"+NombrePalo();
	}
	public double Valor7yMedia() {
		if(getNumero()==8 || getNumero()==9 || getNumero()==10) {
			return 0.5;
		}else {
			return getNumero();
		}
	}
	public int ValorTute() {
		switch(getNumero()) {
		case 1:
			return 11;
		case 3:
			return 10;
		case 8:
			return 2;
		case 9:
			return 3;
		case 10:
			return 4;
		default:
			return 0;
		}
	}
	public int ValorMus() {
		switch(getNumero()) {
		case 1:
		case 2:
			return 1;
		case 3:
		case 8:
		case 9:
		case 10:
			return 10;
		default:
			return getNumero();
		}
	}
	public double Valor7ymedia() {
		switch(getNumero()) {
		case 8:
		case 9:
		case 10:
			return 0.5;
		default:
			return getNumero();
		}
	}
	
}
