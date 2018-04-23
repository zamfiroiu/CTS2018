package program;
import v3_lazyinitialization.Agentie;

public class Program {

	public static void main(String[] args) {
		Agentie primaAgentie=Agentie.getInstanta("AgeTur", 1000, 10);
		Agentie aDouaAgentie=Agentie.getInstanta("O alta agentie", 10, 2);
		
		System.out.println(primaAgentie.getNumeAgentie());
		System.out.println(aDouaAgentie.getNumeAgentie());		
	}
}
