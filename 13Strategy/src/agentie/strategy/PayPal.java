package agentie.strategy;

public class PayPal implements ModPlata {

	@Override
	public void plateste(String numeClient, double sumaPlatita) {
		System.out.println(numeClient + " plateste prin PayPal suma de "+sumaPlatita+" RON");
	}
}
