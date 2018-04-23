package v1_eagerinitialization;

public class AgentieEager {
	private String numeAgentie;
	private float capital;
	private int numarAngajati;

	private static final AgentieEager instanta = new AgentieEager();

	private AgentieEager() {
		this.numeAgentie = "AgeTur";
		this.capital = 1000;
		this.numarAngajati = 5;
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

	public static AgentieEager getInstanta(String nume, float capital, int numarAngajati) {
		return instanta;
	}
}
