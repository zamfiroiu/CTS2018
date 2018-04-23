package agentie.program;

import agentie.clase.*;

public class Program {
	
	private static void afisare(Factory fabrica) {
		PachetTuristic pachetTuristic=fabrica.createPachet();		
		pachetTuristic.descriere();
	}
	
	public static void main(String[] args) {
		afisare(new FactoryPacetAllInclusive());		
	}
}
