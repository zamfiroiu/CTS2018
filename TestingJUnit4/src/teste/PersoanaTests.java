package teste;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Persoana;
import testscategories.BounderyTests;
import testscategories.CrossCheckTests;
import testscategories.ErrorTests;
import testscategories.FastTest;
import testscategories.PerformanceTests;
import testscategories.RightTests;
import testscategories.SlowTest;

public class PersoanaTests {

	@Test
	public void test_corectitudine_varsta() {
		Persoana persoana = new Persoana("NumePrenume", "2891217336691");
		Calendar dataNasterii = Calendar.getInstance();
		dataNasterii.set(1989, 12, 17);
		Calendar dataCurenta = Calendar.getInstance();
		long varsta_zile = TimeUnit.MILLISECONDS
				.toDays(Math.abs(dataCurenta.getTimeInMillis() - dataNasterii.getTimeInMillis()));
		int varsta_ani = (int) (varsta_zile / 365);
		assertEquals(varsta_ani, persoana.getVarsta());
	}

	@Test
	@Category({RightTests.class, FastTest.class})
	public void test_corectitudine_sex() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		Persoana persoana2 = new Persoana("Nume Prenume", "2971013144434");
		Persoana persoana3 = new Persoana("Nume Prenume", "2971023404186");
		assertEquals("M", persoana1.getSex());
		assertEquals("F", persoana2.getSex());
		assertEquals("F", persoana3.getSex());
	}

	@Test
	@Category({RightTests.class,SlowTest.class})
	public void test_corectitudine_checkCNP() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		Persoana persoana2 = new Persoana("Nume Prenume", "2971013144434");
		Persoana persoana3 = new Persoana("Nume Prenume", "2971023404186");
		assertTrue(persoana1.checkCNP());
		assertTrue(persoana2.checkCNP());
		assertTrue(persoana3.checkCNP());
	}

	@Test
	@Category(BounderyTests.class)
	public void test_varsta_persoana_tanara() {
		Persoana persoana = new Persoana("NumePrenume", "6031212241179");
		Calendar dataNasterii = Calendar.getInstance();
		dataNasterii.set(2003, 12, 12);
		Calendar dataCurenta = Calendar.getInstance();
		long varsta_zile = TimeUnit.MILLISECONDS
				.toDays(Math.abs(dataCurenta.getTimeInMillis() - dataNasterii.getTimeInMillis()));
		int varsta_ani = (int) (varsta_zile / 365);
		assertEquals(varsta_ani, persoana.getVarsta());
	}

	@Test
	@Category(BounderyTests.class)
	public void test_varsta_persoana_batrana() {
		Persoana persoana = new Persoana("NumePrenume", "3941212241171");
		Calendar dataNasterii = Calendar.getInstance();
		dataNasterii.set(1894, 12, 12);
		Calendar dataCurenta = Calendar.getInstance();
		long varsta_zile = TimeUnit.MILLISECONDS
				.toDays(Math.abs(dataCurenta.getTimeInMillis() - dataNasterii.getTimeInMillis()));
		int varsta_ani = (int) (varsta_zile / 365);
		assertEquals(varsta_ani, persoana.getVarsta());
	}

	@Test
	@Category({BounderyTests.class,SlowTest.class})
	public void test_checkCNP_limite_extreme() {
		Persoana persoana1 = new Persoana("Nume Prenume", "6031212241179");
		Persoana persoana2 = new Persoana("Nume Prenume", "3941212241179");
		Persoana persoana3 = new Persoana("Nume Prenume", "4031212241124");
		assertTrue(persoana1.checkCNP());
		assertTrue(persoana2.checkCNP());
		assertTrue(persoana3.checkCNP());
	}

	@Test
	@Category({CrossCheckTests.class, FastTest.class})
	public void test_sex_cross_check() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		Persoana persoana2 = new Persoana("Nume Prenume", "2971013144434");
		Persoana persoana3 = new Persoana("Nume Prenume", "2971023404186");
		assertEquals(((Integer.parseInt(persoana1.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana1.getSex());
		assertEquals(((Integer.parseInt(persoana2.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana2.getSex());
		assertEquals(((Integer.parseInt(persoana3.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana3.getSex());
	}

	@Test
	@Category({ErrorTests.class,SlowTest.class})
	public void test_checkCNP_conditii_de_eroare() {
		try {
			Persoana persoana1 = new Persoana("Nume Prenume", "2iili13144434");
			Persoana persoana2 = new Persoana("Nume Prenume", "1tr07381167");
			Persoana persoana3 = new Persoana("Nume Prenume", "2ytzaie04186");
			assertTrue(persoana1.checkCNP());
			assertTrue(persoana2.checkCNP());
			assertTrue(persoana3.checkCNP());
			fail("Codul nu a aruncat exceptie");
		} catch (Exception ert) {
		}
	}

	@Test(timeout = 100)
	@Category({PerformanceTests.class, FastTest.class})
	public void test_performanta() {
		Persoana persoana = new Persoana("Nume Prenume", "2971023404186");
		assertEquals("F", persoana.getSex());
	}

}
