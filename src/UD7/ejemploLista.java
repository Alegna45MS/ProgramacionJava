package UD7;

import java.util.ArrayList;

public class ejemploLista {

	public static void main(String[] args) {
		// defino una lista (es una coleccion)
		ArrayList<Integer> nums=new ArrayList<Integer>(40);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		/*nums.add(4);
		nums.add(10);
		nums.add(0,5);
		//muestro la lista
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		//cambio el segundo elemento de la lista a 12
		nums.set(1, 12);
		
		int numEliminado=nums.remove(0);
		System.out.println("Se ha eliminado el numero "+numEliminado);
		
		//eliminar toda la lista
		System.out.println(nums.isEmpty());
		nums.clear();
		System.out.println(nums.isEmpty());*/
	}		

}
