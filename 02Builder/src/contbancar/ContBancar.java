package contbancar;

public class ContBancar {
	private String detinator;
	private double sumaBlocata;
	private double suma;
	private String moneda;
	
	private boolean cardAtasat;
	private boolean internetBanking;
	private boolean contSalariu;

	@Override
	public String toString() {
		return "ContBancar [detinator=" + detinator + ", sumaBlocata=" + sumaBlocata + ", suma=" + suma + ", moneda="
				+ moneda + ", cardAtasat=" + cardAtasat + ", internetBanking=" + internetBanking + ", contSalariu="
				+ contSalariu + "]";
	}

	public ContBancar() {

	}

	public ContBancar(String detinator, double sumaBlocata, double suma, String moneda, boolean cardAtasat,
			boolean internetBanking, boolean contSalariu) {
		super();
		this.detinator = detinator;
		this.sumaBlocata = sumaBlocata;
		this.suma = suma;
		this.moneda = moneda;
		this.cardAtasat = cardAtasat;
		this.internetBanking = internetBanking;
		this.contSalariu = contSalariu;
	}

	public String getDetinator() {
		return detinator;
	}

	public void setDetinator(String detinator) {
		this.detinator = detinator;
	}

	public double getSumaBlocata() {
		return sumaBlocata;
	}

	public void setSumaBlocata(double sumaBlocata) {
		this.sumaBlocata = sumaBlocata;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public boolean isCardAtasat() {
		return cardAtasat;
	}

	public void setCardAtasat(boolean cardAtasat) {
		this.cardAtasat = cardAtasat;
	}

	public boolean isInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
	}

	public boolean isContSalariu() {
		return contSalariu;
	}

	public void setContSalariu(boolean contSalariu) {
		this.contSalariu = contSalariu;
	}

}
