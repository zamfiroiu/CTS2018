package undo.program;

import undo.clase.ComandaRezervare;
import undo.clase.ComandaVanzare;
import undo.clase.Command;
import undo.clase.Operator;
import undo.clase.PachetCazare;
import undo.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();
		
		Command vanzare=new ComandaVanzare(pachet);
		Command rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);
		
		operator.undo();
		operator.undo();
	}

}
