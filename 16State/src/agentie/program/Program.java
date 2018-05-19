package agentie.program;

import agentie.clase.Rezervare;
import agentie.clase.StareNeplatita;
import agentie.clase.StarePlatita;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1000);
		
		StareNeplatita neplatita=new StareNeplatita();
		neplatita.doAction(rezervare);
		
		StarePlatita platita=new StarePlatita();
		platita.doAction(rezervare);
		
	}

}
