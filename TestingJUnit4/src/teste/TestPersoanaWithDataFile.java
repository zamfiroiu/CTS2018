package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import clase.Persoana;

public class TestPersoanaWithDataFile {

	@Test
	public void test_checkCNP_with_file_data() {
		FileReader fr=null;
		BufferedReader reader=null;
		try {
			fr = new FileReader("date_personale.txt");
			reader=new BufferedReader(fr);
			String linie="";
			while((linie=reader.readLine())!=null)
			{
				Persoana p=new Persoana("Nume",linie);
				assertTrue("Eroare la CNP-ul: "+linie,p.checkCNP());	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
