package undo.clase;

public class PachetCazare implements PachetTuristic {
	private int cod;


	public PachetCazare(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void vanzare() {
		System.out.println("Pachetul de cazare cu codul "+cod+" a fost vandut");
		
	}

	@Override
	public void rezerva() {
		System.out.println("Pachetul de cazare cu codul "+cod+" a fost rezervat");
		
	}

	@Override
	public void anulareVanzare() {
		System.out.println("A fost anulata vanzarea pachetului de cazare cu codul "+cod+". Banii au fost restituiti");	
	}

	@Override
	public void anulareRezervare() {
		System.out.println("A fost anulata rezervarea pachetului de cazare cu codul "+cod+".");
	}

}
