package hotel.chain;

import hotel.observer.Client;

public class NotificatorEmail extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
		if (client.getEmail() != null) {
			client.primesteEmail(mesaj);
		} else {
			super.getSuccesor().notifica(client, mesaj);
		}
	}

}
