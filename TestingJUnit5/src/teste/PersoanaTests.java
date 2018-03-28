package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import clase.Persoana;
import interfete.*;

public class PersoanaTests {

	@Test
	@Ignore
	public void testCuMesaj() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		assertTrue(persoana1.checkCNP(), "CNP incorect");
	}

	@Test
	@Tag("Right")
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
	@Tag("Right")
	@Tag("Fast")
	public void test_corectitudine_sex() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		Persoana persoana2 = new Persoana("Nume Prenume", "2971013144434");
		Persoana persoana3 = new Persoana("Nume Prenume", "2971023404186");
		assertEquals("M", persoana1.getSex());
		assertEquals("F", persoana2.getSex());
		assertEquals("F", persoana3.getSex());
	}

	@Test
	@Tag("Right")
	@Tag("Slow")
	public void test_corectitudine_checkCNP() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		Persoana persoana2 = new Persoana("Nume Prenume", "2971013144434");
		Persoana persoana3 = new Persoana("Nume Prenume", "2971023404186");
		assertTrue(persoana1.checkCNP());
		assertTrue(persoana2.checkCNP());
		assertTrue(persoana3.checkCNP());
	}

	@Test
	@Tag("Boundery")
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
	@Tag("Boundery")
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
	@Tag("Boundery")
	@Tag("Slow")
	public void test_checkCNP_limite_extreme() {
		Persoana persoana1 = new Persoana("Nume Prenume", "6031212241179");
		Persoana persoana2 = new Persoana("Nume Prenume", "3941212241179");
		Persoana persoana3 = new Persoana("Nume Prenume", "4031212241124");
		assertTrue(persoana1.checkCNP());
		assertTrue(persoana2.checkCNP());
		assertTrue(persoana3.checkCNP());
	}

	@Test
	@Tag("CrossCheck")
	@FastTest
	public void test_sex_cross_check() {
		Persoana persoana1 = new Persoana("Nume Prenume", "1900807381167");
		Persoana persoana2 = new Persoana("Nume Prenume", "2971013144434");
		Persoana persoana3 = new Persoana("Nume Prenume", "2971023404186");
		assertEquals(((Integer.parseInt(persoana1.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana1.getSex());
		assertEquals(((Integer.parseInt(persoana2.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana2.getSex());
		assertEquals(((Integer.parseInt(persoana3.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana3.getSex());
	}

	@Test
	@Tag("Error")
	@Tag("Slow")
	public void test_checkCNP_conditii_de_eroare() {
		Persoana persoana1 = new Persoana("Nume Prenume", "2iili13144434");
		assertThrows(Exception.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				assertTrue(persoana1.checkCNP());

			}
		});
	}

	@Test
	@Tag("Performance")
	@Tag("Fast")
	public void test_performanta() {
		Persoana persoana = new Persoana("Nume Prenume", "2971023404186");
		assertTimeout(Duration.ofMillis(10), new Executable() {
			@Override
			public void execute() throws Throwable {
				assertEquals("F", persoana.getSex());
			}
		});
	}

}
