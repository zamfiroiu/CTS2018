package agentie.clase;

public class StarePlatita implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul "+rezervare.getId()+" este trecuta in starea PLATITA");
		rezervare.setState(this);
	}
}
