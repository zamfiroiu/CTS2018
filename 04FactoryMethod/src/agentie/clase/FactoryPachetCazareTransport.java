package agentie.clase;

public class FactoryPachetCazareTransport implements Factory {

	@Override
	public PachetTuristic createPachet() {
		return new PachetCazareTransport();
	}

}
