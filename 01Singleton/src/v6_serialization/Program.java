package v6_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		AgentieSerialization agentie=AgentieSerialization.getInstanta("Nume1", 1000, 10);
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("fisier.dat"));
		out.writeObject(agentie);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("fisier.dat"));
		AgentieSerialization agentie2=(AgentieSerialization)in.readObject();
		
		agentie2.setNumarAngajati(200);
		agentie2.setCapital(2000);
		agentie2.setNumeAgentie("Nume2");
		
		System.out.println(agentie.getNumeAgentie()+" "+agentie.getCapital());
		System.out.println(agentie2.getNumeAgentie()+" "+agentie2.getCapital());
	}

}
