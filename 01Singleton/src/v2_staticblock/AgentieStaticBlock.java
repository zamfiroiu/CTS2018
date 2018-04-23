package v2_staticblock;

public class AgentieStaticBlock {
	private String numeAgentie;
	private float capital;
	private int numarAngajati;

	private static AgentieStaticBlock instanta;

	static {
		try {
			instanta = new AgentieStaticBlock();
		} catch (Exception exception) {
			System.out.println("Agentia nu poate fi creata.");
		}
	}

	private AgentieStaticBlock() {
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

	public static AgentieStaticBlock getInstanta(String nume, float capital, int numarAngajati) {
		return instanta;
	}
}
