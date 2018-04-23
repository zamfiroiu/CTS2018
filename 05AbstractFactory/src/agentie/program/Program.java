package agentie.program;

import agentie.clase.Factory;
import agentie.clase.FactoryCategoria1;
import agentie.clase.PachetCazare;

public class Program {	
	PachetCazare obtineCazare(Factory fabrica){
		return fabrica.createPachetCazare();
	}

	public static void main(String[] args) {
		Factory fabricaAgentie=new FactoryCategoria1();
		PachetCazare cazare= fabricaAgentie.createPachetCazare();
		cazare.descriere();
	}
}
