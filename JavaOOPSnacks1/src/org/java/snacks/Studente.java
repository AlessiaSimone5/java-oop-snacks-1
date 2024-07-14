package org.java.snacks;

public class Studente {

	String nome;
	String cognome;
	int eta;
	
	Studente  (String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	public String getNomeCognomeEta() {
		return nome + " " + cognome + " , " + eta + " anni";
	}
}
