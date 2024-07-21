package org.java.snacks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubgist

		RegistroStudenti rs = new RegistroStudenti ();
		
		
		Studente s = new Studente("Alessia","Simone",26);
		Studente s2 = new Studente("Paride","D'Angelo",28);
		
		rs.addStudente(s);
		rs.addStudente(s2);
		
		rs.stampaStudenti();
	
		
		
		 
		

		
		
	

	}

}
