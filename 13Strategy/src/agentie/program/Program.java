package agentie.program;

import agentie.strategy.Card;
import agentie.strategy.Cash;
import agentie.strategy.Client;

public class Program {

	public static void main(String[] args) {
		Client client=new Client("Popescu");
		
		client.setModPlata(new Card());
		client.plateste(300);
		
		client.setModPlata(new Cash());
		client.plateste(100);
	}

}
