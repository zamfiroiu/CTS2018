package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Companie;
import clase.IPersoana;
import testscategories.FastTest;
import testscategories.RightTests;
import utilsfortests.PersoanaStub;

public class CompanieStubTests {

	@Test
	@Category(RightTests.class)
	public void test_verificareLegalitate() {		
		IPersoana persoana=new PersoanaStub("Nume Prenume","43");
		Companie c=new Companie("Companie",persoana,1000);
		assertTrue(c.verificareLegalitate());		
	}
}
