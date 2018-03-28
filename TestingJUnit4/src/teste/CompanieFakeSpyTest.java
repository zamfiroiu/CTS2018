package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Companie;
import testscategories.FastTest;
import testscategories.RightTests;
import utilsfortests.PersoanaFakeSpy;

public class CompanieFakeSpyTest {

	@Test
	@Category(RightTests.class)
	public void test_verificareLegalitate() {		
		PersoanaFakeSpy persoana=new PersoanaFakeSpy("Nume Prenume","43");
		persoana.setValoareCheckCNP(true);
		persoana.setValoareGetSex("M");
		persoana.setValoareGetVarsta(27);
		Companie c=new Companie("Companie",persoana,1000);
		assertTrue(c.verificareLegalitate());	
		System.out.println(persoana.getRaport());
	}

}
