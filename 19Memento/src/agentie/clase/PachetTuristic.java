package agentie.clase;

public class PachetTuristic {

	private double pret;
	private String numePachet;

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public PachetTuristic(double pret) {
		super();
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "PachetTuristic [pret=" + pret + "]";
	}	
	
	public MementoPachetTuristic salvareMemento(){
		return new MementoPachetTuristic(pret);
	}
	
	public void undoToMemento(MementoPachetTuristic memento){
		this.pret=memento.getPretPachet();
	}
}
