package UD6;

public class Persona2 {
	private String DNI;
	private Cuenta2[] cuentas;
	private int cuentasAsociadas;
	
	public Persona2(String dni) {
		this.DNI=dni;
		cuentasAsociadas=0;
		cuentas=new Cuenta2[3];
	}
	public String dameDNI() {
		return DNI;
	}
	public boolean addCuenta(String numCuenta) {
		//si ya tenemos 3 cuentas asociadas a la persona
		if (cuentasAsociadas>=3) {
			return false;
		}
		//añadimos una cuenta nueva a la persona
		cuentas[cuentasAsociadas]=new Cuenta2(numCuenta);
		cuentasAsociadas++;
		return true;
	}
	public String toString() {
		String cadena="DNI:"+DNI;
		for(int i=0;i<cuentasAsociadas;i++) {
			cadena=cadena+cuentas[i].toString();
		}
		return cadena;
		//return "DNI:"+DNI+"Numero de cuentas:"+cuentasAsociadas;
	}
	public Cuenta2 dameCuenta(String numCuenta) {
		for(int i=0;i<cuentasAsociadas;i++) {
			Cuenta2 c=cuentas[i];
			if(numCuenta.equals(c.dameCuenta())) {
				return c;
			}
		}
		return null;
	}
	public boolean esMorosa() {
		return true;
	}
	
}
