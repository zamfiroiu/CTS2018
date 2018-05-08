package agentie.program;

import agentie.clase.FabricaDePachete;
import agentie.clase.IPachetTuristic;
import agentie.clase.Optionale;
import agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		FabricaDePachete fabricaPachete = new FabricaDePachete();
		Optionale optional1=new Optionale(true, 3);
		Optionale optional2=new Optionale(false, 3);
		Optionale optional3=new Optionale(true, 1);
		Optionale optional4=new Optionale(true, 5);
		
		PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPachetTuristic(1);
		pachet.descriePachet(optional1);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
		optional2.setNumarExcursii(40);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional3);
		fabricaPachete.getPachetTuristic(1).descriePachet(optional4);
		
		System.out.println(fabricaPachete.getNumarPachete());
		
	/*	IPachetTuristic pachet1=new PachetTuristic(1, "blabla", "bucuresti", true);
		
		Optionale op1=new Optionale(true, 3, pachet1);
		Optionale op2=new Optionale(false, 3, pachet1);

		Optionale op3=new Optionale(true, 3, );*/
		
	}

}
