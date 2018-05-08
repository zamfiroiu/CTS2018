package agentie.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CompanieAeriana {
	private String numeCompanieAeriana;
	
	public CompanieAeriana(String nume) {
		this.numeCompanieAeriana = nume;
	}
	
	@Override
	public String toString() {
		return "CompanieAeriana [numeCompanieAeriana=" + numeCompanieAeriana + "]";
	}

	public Zbor rezervaBiletAvion(String plecare, String destinatie) {
		Zbor zbor=new Zbor(plecare, destinatie, this);
		return zbor;
	}
}
