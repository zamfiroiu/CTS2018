package hotel.observer;

public class Client implements Observer {
	private String nume;
	private String nrTelefon;
	private String email;

	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void primesteSMS(String sms) {
		System.out.println(this.nume + " Ai primit un sms cu mesajul " + sms);
	}

	@Override
	public void primesteEmail(String email) {
		System.out.println(this.nume + " Ai primit un email cu mesajul " + email);

	}

}
