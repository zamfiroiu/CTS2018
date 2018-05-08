package agentie.clase;


public class Hotel {
	private String numeHotel;
	
	public Hotel(String nume) {
		this.numeHotel = nume;
	}
	public void rezervaCamera(String oras) {
		System.out.println("In hotelul " + this.numeHotel +" din orasul " + oras + " se rezerva o camera.");
	}
}
