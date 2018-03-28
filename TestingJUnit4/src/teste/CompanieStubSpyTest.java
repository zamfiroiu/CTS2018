package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Companie;
import testscategories.FastTest;
import testscategories.RightTests;
import utilsfortests.PersoanaStubSpy;

public class CompanieStubSpyTest {

	@Test
	@Category(RightTests.class)
	public void test_verificareLegalitate() {		
		PersoanaStubSpy persoana=new PersoanaStubSpy("Nume Prenume","43");
		Companie c=new Companie("Companie",persoana,1000);
		assertTrue(c.verificareLegalitate());	
		System.out.println(persoana.getRaport());
	}

}
