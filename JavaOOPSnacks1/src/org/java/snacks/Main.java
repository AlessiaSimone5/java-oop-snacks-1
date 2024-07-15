package org.java.snacks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studente s = new Studente("Alessia","Simone",26);
		 
//		System.out.println(s.nome);
//		System.out.println(s.cognome);
//		System.out.println(s.eta);
		
		System.out.println(s.getNomeCognomeEta());
		
		RegistroStudenti registro = new RegistroStudenti();
		registro.addStudente(s);
		
	

	}

}
