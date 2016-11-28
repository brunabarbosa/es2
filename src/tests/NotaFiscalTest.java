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
			nt = new NotaFiscal(null, 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser negativo ou vazio", e.getMessage());

		}

		try {
			nt = new NotaFiscal("", 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser negativo ou vazio", e.getMessage());

		}
		
		try {
			nt = new NotaFiscal("Bruna Barbosa", -1);
			fail();
		} catch (Exception e) {
			assertEquals("Valor da nota fiscal nao pode ser negativo", e.getMessage());
		}
		
		nt = new NotaFiscal("Bruna Barbosa", 125.2);
		assertEquals(125.2, nt.getValor(), 0);
		
	}
	
	@Test
	public void calculaImpostoValorDefaultTest() throws Exception{
		nt = new NotaFiscal("Bruna Barbosa", 120.5);
		assertEquals(7.23, nt.calculaImposto(), 0);
	}
	
}
