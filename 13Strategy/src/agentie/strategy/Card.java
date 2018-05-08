package agentie.strategy;

public class Card implements ModPlata {

	@Override
	public void plateste(String numeClient, double sumaPlatita) {
		System.out.println(numeClient + " plateste cu cardul suma de " + sumaPlatita + " RON");
	}

}
