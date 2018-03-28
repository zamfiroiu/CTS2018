package teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Companie;
import clase.Persoana;
import testscategories.FastTest;
import testscategories.RightTests;

public class CompanieMockitoTest {

	@Test
	@Category(RightTests.class)
	public void test_verificareLegalitate_mockito() {		
		Persoana p=mock(Persoana.class);
		when(p.getVarsta()).thenReturn(21);
		System.out.println(p.getSex());
		Companie c=new Companie("Companie", p, 1000);
		assertTrue(c.verificareLegalitate());	
	}


}
