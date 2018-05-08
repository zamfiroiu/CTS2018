package agentie.program;

import agentie.clase.Facade;

public class Program {

	public static void main(String[] args) {
		Facade rezervareSejur=new Facade();		
		rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Moeciu de Sus");
	}
}
