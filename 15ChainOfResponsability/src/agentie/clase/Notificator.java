package agentie.clase;

public abstract class Notificator {

	private Notificator urmatorulNotificator;
	
	public Notificator getUrmatorulNotificator() {
		return urmatorulNotificator;
	}

	public void setUrmatorulNotificator(Notificator notificator){
		this.urmatorulNotificator = notificator;
	}
	
	public abstract void notifica(Client client, String mesaj);
}
