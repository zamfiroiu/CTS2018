package v6_serialization;

import java.io.Serializable;

public class AgentieSerialization implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeAgentie;
	private float capital;
	private int numarAngajati;

	private static AgentieSerialization instanta = null;

	public static AgentieSerialization getInstanta(String nume, float capital, int numarAngajati) {
		if (instanta == null)
			instanta = new AgentieSerialization(nume, capital, numarAngajati);
		return instanta;
	}

	protected Object readResolve() {
		return getInstanta("Nu conteaza", 0, 0);
	}
	
	private AgentieSerialization(String numeAgentie, float capital, int numarAngajati) {
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
}
