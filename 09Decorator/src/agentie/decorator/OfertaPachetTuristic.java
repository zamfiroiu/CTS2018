package agentie.decorator;

import agentie.clase.PachetTuristic;

public abstract class OfertaPachetTuristic implements PachetTuristic {
	private PachetTuristic pachetTuristic;
	
	public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
		this.pachetTuristic = pachetTuristic;
	}

	public void descriere(){
		pachetTuristic.descriere();
	}
	
	public abstract void anulareRezervare();
}
