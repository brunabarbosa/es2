package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import es2.NotaFiscal;


public class NotaFiscalTest {
	
	private NotaFiscal nt;

	@Before 
	public void setUt() throws Exception{}

	@Test
	public void criaNotaFiscalTest() throws Exception {
		
		try {
			nt = new NotaFiscal(null, 0, 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser nulo ou vazio", e.getMessage());

		}

		try {
			nt = new NotaFiscal("", 0, 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser nulo ou vazio", e.getMessage());

		}
		
		try {
			nt = new NotaFiscal("Bruna Barbosa", -1, 0);
			fail();
		} catch (Exception e) {
			assertEquals("Valor da nota fiscal nao pode ser negativo", e.getMessage());
		}
		
		try {
			nt = new NotaFiscal("Bruna Barbosa", 100, -1);
			fail();
		} catch (Exception e) {
			assertEquals("Imposto nao pode ser negativo", e.getMessage());
		}
		
		nt = new NotaFiscal("Bruna Barbosa", 125.2, 0);
		assertEquals(125.2, nt.getValor(), 0);
		
	}
	
	
}