package hotel.clase;

public class Rezervare implements IRezervare {

	private int numarNopti;
	private int codRezervare;
	
	public int getNumarNopti() {
		return numarNopti;
	}
	
	public Rezervare(int numarNopti, int codRezervare) {
		super();
		this.numarNopti = numarNopti;
		this.codRezervare = codRezervare;
	}

	@Override
	public void anulareRezervare() {
		System.out.println("Rezervare cu codul "+codRezervare+" a fost anulata.");
	}

}
