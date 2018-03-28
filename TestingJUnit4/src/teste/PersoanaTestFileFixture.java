package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Persoana;

public class PersoanaTestFileFixture {
	private FileReader fr=null;
	private BufferedReader reader=null;
	
	@Before
	public void setUp() throws Exception {
		fr = new FileReader("date_personale.txt");
		reader=new BufferedReader(fr);
	}

	@After
	public void tearDown() throws Exception {
		reader.close();
		fr.close();
	}

	@Test
	public void test() {
		String linie="";
		try {
			while((linie=reader.readLine())!=null)
			{
				Persoana p=new Persoana("Nume",linie);
				assertTrue("Eroare la CNP-ul: "+linie,p.checkCNP());	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
