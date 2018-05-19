package undo.clase;

public class ComandaVanzare implements Command {

	private PachetTuristic pachet;
	
	public ComandaVanzare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}

	@Override
	public void executa() {
		pachet.vanzare();

	}

	@Override
	public void unexecute() {
		pachet.anulareVanzare();		
	}

}
