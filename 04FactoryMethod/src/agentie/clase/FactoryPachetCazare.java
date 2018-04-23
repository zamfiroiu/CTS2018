package agentie.clase;

public class FactoryPachetCazare implements Factory {

	@Override
	public PachetTuristic createPachet() {
		return new PachetCazare();
	}
}
