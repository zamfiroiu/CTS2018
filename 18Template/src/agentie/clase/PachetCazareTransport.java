package agentie.clase;

public class PachetCazareTransport extends PachetTuristic {

	public PachetCazareTransport(int codPachet) {
		super(codPachet);
	}

	@Override
	public void cautareCazare(int codPachet) {
		System.out.println("S-a gasit cazare pentru pachetul cu codul "+codPachet);
	}

	@Override
	public void cautareTransport(int codPachet) {
		System.out.println("S-a gasit transport pentru pachetul cu codul "+codPachet);

	}

	@Override
	public void rezervaPachet(int codPachet) {
		System.out.println("S-a rezervat pachetul " + codPachet);
	}

	@Override
	public void platirePachet(int codPachet) {
		System.out.println("S-a platit pachetul " + codPachet);
	}
}
