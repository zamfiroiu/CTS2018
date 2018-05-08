package hotel.chain;

import hotel.observer.Client;

public class NotificatorManager extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		System.out.println("Nu avem date pentru clientul "+client.getNume());
		
	}

}
