package agentie.clase;

public class PachetTransport implements PachetTuristic {

	private int cod;
	
	public PachetTransport(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void vanzare() {
		System.out.println("Pachetul de transport cu codul "+cod+" a fost vandut");
		
	}

	@Override
	public void rezerva() {
		System.out.println("Pachetul de transport cu codul "+cod+" a fost rezervat");
		
	}
}
