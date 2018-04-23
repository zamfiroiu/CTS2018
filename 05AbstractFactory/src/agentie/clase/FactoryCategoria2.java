package agentie.clase;

public class FactoryCategoria2 implements Factory {

	@Override
	public PachetCazare createPachetCazare() {
		return new CazareCategoria2();
	}

	@Override
	public PachetTransport createPachetTransport() {
		return new TransportCategoria2();
	}

}
