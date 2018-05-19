package agentie.clase;

public class PachetCazare implements PachetTuristic {
	private int cod;


	public PachetCazare(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void vanzare() {
		System.out.println("Pachetul de cazare cu codul "+cod+" a fost vandut");
		
	}

	@Override
	public void rezerva() {
		System.out.println("Pachetul de cazare cu codul "+cod+" a fost rezervat");
		
	}

}
