package agentie.clase;

public class FactoryPacetAllInclusive implements Factory {

	@Override
	public PachetTuristic createPachet() {
		return new PachetAllInclusive();
	}

}
