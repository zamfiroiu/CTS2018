package agentie.clase;

public class StareNeplatita implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul "+rezervare.getId()+" este trecuta in starea NEPLATITA");
		rezervare.setState(this);
	}

}
