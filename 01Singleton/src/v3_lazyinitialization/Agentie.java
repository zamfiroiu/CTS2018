package v3_lazyinitialization;

public class Agentie {
	private String numeAgentie;
	private float capital;
	private int numarAngajati;

	private static Agentie instanta = null;

	private Agentie(String numeAgentie, float capital, int numarAngajati) {
		this.numeAgentie = numeAgentie;
		this.capital = capital;
		this.numarAngajati = numarAngajati;
	}

	public String getNumeAgentie() {
		return numeAgentie;
	}

	public void setNumeAgentie(String numeAgentie) {
		this.numeAgentie = numeAgentie;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}

	public static Agentie getInstanta(String nume, float capital, int numarAngajati) {
		if (instanta == null) {
			instanta = new Agentie(nume, capital, numarAngajati);
		}
		return instanta;
	}
}
