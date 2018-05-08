package hotel.chain;

import hotel.observer.Client;

public abstract class Notificator {
	private Notificator succesor;

	public Notificator getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}
	
	 public abstract void  notifica(Client client, String mesaj);
	

}
