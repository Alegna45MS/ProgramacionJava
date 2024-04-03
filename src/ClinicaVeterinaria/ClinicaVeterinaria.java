package ClinicaVeterinaria;

import java.util.ArrayList;

public class ClinicaVeterinaria {
	private ArrayList listaAnimales;
	
	public ClinicaVeterinaria(ArrayList listaAnimales) {
		this.listaAnimales=new ArrayList<Animal>();
	}
	public void insertarAnimal(Animal a) {
		listaAnimales.add(a);
	}
}
