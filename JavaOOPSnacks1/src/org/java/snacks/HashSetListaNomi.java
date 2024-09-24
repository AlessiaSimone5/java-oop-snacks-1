package org.java.snacks;

import java.util.HashSet;

public class HashSetListaNomi {
	
	public static boolean indice (HashSet<String> nomiInLista, HashSet<String> elemento) {
		

			if(nomiInLista.containsAll(elemento)) 
				return true;
			
		
		return false;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> listaNomi = new HashSet<String>();
		HashSet<String> listaNomi2 = new HashSet<String>();
		
		listaNomi.add("Viviana");
		listaNomi.add("Mariacristina");
		listaNomi2.add("Viviana");
		listaNomi2.add("Mariacristina");
		
		System.out.println(listaNomi);
		System.out.println(listaNomi2);
		
		System.out.println("Le liste sono uguali --> " + indice(listaNomi, listaNomi2));
		
	}

}
