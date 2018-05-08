package agentie.strategy;

public class Cash implements ModPlata {

	@Override
	public void plateste(String numeClient, double sumaPlatita) {
		System.out.println(numeClient + " plateste cash suma de " + sumaPlatita);
	}

}
