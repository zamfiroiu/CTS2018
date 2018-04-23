package agentie.clase;

public class FactoryCategoria1 implements Factory {

	@Override
	public PachetCazare createPachetCazare() {
		return new CazareCategoria1();
	}

	@Override
	public PachetTransport createPachetTransport() {
		return new TransportCategoria1();
	}

}
