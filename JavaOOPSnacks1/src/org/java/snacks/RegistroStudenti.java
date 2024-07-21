package org.java.snacks;

public class RegistroStudenti {
	
	private Studente [] registroStudenti;

	RegistroStudenti () {
	 registroStudenti = new Studente [0];
	}
	
	public void addStudente(Studente nuovoStudente) {
		Studente [] nuovoRegistro = new Studente [registroStudenti.length + 1];
		
		for (int i=0; i < registroStudenti.length; i++) {
			nuovoRegistro[i]=registroStudenti[i];			
		}
		nuovoRegistro[nuovoRegistro.length-1] = nuovoStudente;
		
		registroStudenti = nuovoRegistro;
	}
	
	public void stampaStudenti () {

		for (int i=0; i < registroStudenti.length; i++) {
			System.out.println(registroStudenti[i].getNomeCognomeEta());		
		}
		
		
	}
	
	

}
