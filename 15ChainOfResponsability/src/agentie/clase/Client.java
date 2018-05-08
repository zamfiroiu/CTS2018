package agentie.clase;

public class Client {
	private String nume;
	private String nr_telefon;
	private String adresa_mail;
	
	public Client(String nume, String nr_telefon, String adresa_mail) {
		super();
		this.nume = nume;
		this.nr_telefon = nr_telefon;
		this.adresa_mail = adresa_mail;
	}
	public Client(String nume) {
		super();
		this.nume = nume;
		this.nr_telefon = null;
		this.adresa_mail = null;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNr_telefon() {
		return nr_telefon;
	}
	public void setNr_telefon(String nr_telefon) {
		this.nr_telefon = nr_telefon;
	}
	public String getAdresa_mail() {
		return adresa_mail;
	}
	public void setAdresa_mail(String adresa_mail) {
		this.adresa_mail = adresa_mail;
	}	
}
