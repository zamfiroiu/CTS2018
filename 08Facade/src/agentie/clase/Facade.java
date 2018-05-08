package agentie.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Facade {
	public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie) {

		CompanieAeriana companieAeriana=new CompanieAeriana("CTSAirLines");
		Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
		Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie, orasPlecare);
		
		Hotel hotel = new Hotel("CTS Hotel");
		System.out.println(zborDus.toString());
		System.out.println(zborIntors.toString());
		hotel.rezervaCamera(orasDestinatie);		
	}
}
