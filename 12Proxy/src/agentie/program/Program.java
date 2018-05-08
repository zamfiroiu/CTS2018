package agentie.program;

import agentie.clase.PachetTransport;
import agentie.clase.Persoana;
import agentie.clase.ProxyPachet;

public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Popescu", 34);
		PachetTransport pachetTransport=new PachetTransport(persoana);
		pachetTransport.rezervaPachet();
		
		ProxyPachet pachetTransportProxy=new ProxyPachet(persoana);
		pachetTransportProxy.rezervaPachet();

	}

}
