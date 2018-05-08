package agentie.program;

import agentie.clase.PachetCazare;
import agentie.clase.PachetTuristic;
import agentie.decorator.OfertaPachetCazare;
import agentie.decorator.OfertaPachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachetTuristic = new PachetCazare();
		pachetTuristic.descriere();
		System.out.println("Acest pachet nu poate fi anulat");
		System.out.println();
		
		
		OfertaPachetTuristic pachetTuristicOferta=new OfertaPachetCazare(pachetTuristic);
		pachetTuristicOferta.descriere();
		System.out.println("Acest pachet poate fi anulat");
		pachetTuristicOferta.anulareRezervare();
	}

}
