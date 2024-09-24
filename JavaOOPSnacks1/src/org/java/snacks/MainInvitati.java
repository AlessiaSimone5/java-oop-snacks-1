package org.java.snacks;

import java.util.ArrayList;

public class MainInvitati {
	
	public static int indiceDaNome (ArrayList<String> lista, String nomeDaCercare) {
		
		for (int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i); 
			if (nome.equals(nomeDaCercare)) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listaInvitati = new ArrayList<String>();
		
		listaInvitati.add("Alessia Simone");
		listaInvitati.add("Ivano Simone");
		listaInvitati.add("Barbara Simone");
		listaInvitati.add("Enrico Simone");
		listaInvitati.add("Antonia Mucaria");

		int indiceTrovato = indiceDaNome(listaInvitati, "Enrico Simone");
		System.out.println(indiceTrovato);
	}

}
