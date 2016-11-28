package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import es2.ConsultoriaNotaFiscal;

public class ConsultoriaNotaFiscalTest {

	private ConsultoriaNotaFiscal nc;
	
	
	@Before 
	public void setUt() throws Exception{}

	@Test
	public void criaConsultoriaNotaFiscalTest() throws Exception{
		try {
			nc = new ConsultoriaNotaFiscal(null, 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser negativo ou vazio", e.getMessage());

		}

		try {
			nc = new ConsultoriaNotaFiscal("", 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser negativo ou vazio", e.getMessage());

		}
		
		try {
			nc = new ConsultoriaNotaFiscal("Bruna Barbosa", -1);
			fail();
		} catch (Exception e) {
			assertEquals("Valor da nota fiscal nao pode ser negativo", e.getMessage());
		}
		
		nc = new ConsultoriaNotaFiscal("Bruna Barbosa", 120);
		assertEquals(120, nc.getValor(), 0);
	}
	
	@Test
	public void calculaImpostoConsultoriaTest() throws Exception{
		nc = new ConsultoriaNotaFiscal("Bruna Barbosa", 120.5);
		assertEquals(30.125, nc.calculaImposto(), 0);
	}
	
}
