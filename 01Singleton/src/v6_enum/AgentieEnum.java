package v6_enum;

public enum AgentieEnum {
	instanta;
	
	private String numeAgentie;
	private float capital;
	private int numarAngajati;
	
	private AgentieEnum() {
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
}
