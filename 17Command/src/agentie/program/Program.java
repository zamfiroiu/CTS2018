package agentie.program;

import agentie.clase.ComandaRezervare;
import agentie.clase.ComandaVanzare;
import agentie.clase.Command;
import agentie.clase.Operator;
import agentie.clase.PachetCazare;
import agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();
		
		Command vanzare=new ComandaVanzare(pachet);
		Command rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);
		

	}

}
