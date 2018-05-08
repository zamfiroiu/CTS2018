package hotel.program;

import hotel.strategy.Client;
import hotel.strategy.VerificareAmericani;
import hotel.strategy.VerificareEuropeniUE;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Gigel", new VerificareAmericani());
		client.verificareDocumente();
		client.setModVerificare(new VerificareEuropeniUE());
		client.verificareDocumente();
	}

}
