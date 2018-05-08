package hotel.strategy;

public class Client {
	private String nume;
	private ModVerificare modVerificare;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public ModVerificare getModVerificare() {
		return modVerificare;
	}
	public void setModVerificare(ModVerificare modVerificare) {
		this.modVerificare = modVerificare;
	}
	public Client(String nume, ModVerificare modVerificare) {
		super();
		this.nume = nume;
		this.modVerificare = modVerificare;
	}
	
	public void verificareDocumente() {
	   modVerificare.verificaActe(nume);
	}
	
	
	
	

}
