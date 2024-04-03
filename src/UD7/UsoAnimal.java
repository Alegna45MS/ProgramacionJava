package UD7;

import java.util.ArrayList;

public class UsoAnimal {

	public static void main(String[] args) {
		ArrayList<Animal> animales=new ArrayList<Animal>();
		animales.add(new Perro("bully","buldog"));
		animales.add(new Pajaro("Garfio","Loro"));
		
		for(int i=0;i<animales.size();i++) {
			animales.get(i).dameFichaAnimal();
		}
	}

}
