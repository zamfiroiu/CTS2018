package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Companie;
import testscategories.FastTest;
import testscategories.RightTests;
import utilsfortests.PersoanaFake;

public class CompanieFakeTest {

	@Test
	@Category(RightTests.class)
	public void test_verificareLegalitate() {		
		PersoanaFake persoana=new PersoanaFake("Nume Prenume","43");
		persoana.setValoareCheckCNP(true);
		persoana.setValoareGetSex("M");
		persoana.setValoareGetVarsta(25);
		Companie c=new Companie("Companie",persoana,1000);
		assertTrue(c.verificareLegalitate());		
	}
}
