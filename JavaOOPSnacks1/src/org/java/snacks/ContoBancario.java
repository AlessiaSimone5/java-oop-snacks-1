package org.java.snacks;

//attributi
public class ContoBancario {
	String numeroConto ;
	double saldo;
	
	//construttore
	ContoBancario (String numeroConto) {
		this.numeroConto = numeroConto;
		this.saldo = 0.0;
	}
	
	public void depositoDenaro(double denaro) {
		if (denaro > 0) {
			saldo += denaro;
			System.out.println("Hai depositato " + denaro + " €");
		}else {
			System.out.println("Non è presente denaro");
		}
	}
		public void prelevoDenaro (double denaro) {
			if (denaro > 0) {
			saldo -= denaro;
			System.out.println("Hai prelevato " + denaro + " €");
			} else {
				System.out.println("Prelievo non disponibile");
			}
		}
		
		public void saldoCorrente (double corrente) {
			
		}
		 
		public double getSaldo () {
			return this.saldo;
		}

		
		
	

	public static void main(String[] args) {
		
		ContoBancario conto = new ContoBancario("500.000");
		
		System.out.println(conto.numeroConto);
		
		System.out.println("Il saldo è di " + conto.getSaldo() + " €");
		
		conto.depositoDenaro(10);
		System.out.println("Il saldo è di " + conto.getSaldo() + " €");
		conto.prelevoDenaro(20);
		System.out.println("Il saldo è di " + conto.getSaldo() + " €");
	}

}
