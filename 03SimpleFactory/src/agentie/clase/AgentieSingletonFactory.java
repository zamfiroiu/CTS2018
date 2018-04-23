package agentie.clase;

public class AgentieSingletonFactory {
	private static AgentieSingletonFactory instanta = null;
	
	private AgentieSingletonFactory(){
		
	}
	
	public static synchronized AgentieSingletonFactory getInstanta(){
		if(instanta == null) {
			instanta=new AgentieSingletonFactory();
		}
		return instanta;
	}
	
	public PachetTuristic createPachet(TipPachet tipPachet) throws Exception {
		switch (tipPachet) {
			case pachetCazare:
				return new PachetCazare();
			case pachetTransport:
				return new PachetTransport();
			case pachetCazareSiTransport:
				return new PachetCazareTransport();
			default:
				throw new Exception("Tipul primit nu este corect");
		}
	}
}
