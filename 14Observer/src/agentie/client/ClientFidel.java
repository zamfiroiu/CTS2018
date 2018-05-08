package agentie.client;

public class ClientFidel implements Observer {

	private String numeClient;
	
	public ClientFidel(String nume) {
		this.numeClient=nume;
	}
	
	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println(numeClient + " ai primit mesajul: " + mesaj);
	}
}
