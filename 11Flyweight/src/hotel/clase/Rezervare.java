package hotel.clase;

public class Rezervare {

	private String numeClient;
	private int numarCamera;
	
	@Override
	public String toString() {
		return "Rezervare [numeClient=" + numeClient + ", numarCamera=" + numarCamera + "]";
	}

	public Rezervare(String numeClient, int numarCamera) {
		super();
		this.numeClient = numeClient;
		this.numarCamera = numarCamera;
	}	
}
