package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import es2.TreinamentoNotaFiscal;

public class TreinamentoNotaFiscalTest {

	private TreinamentoNotaFiscal tnf;
		
	@Before 
	public void setUt() throws Exception{}

	@Test
	public void criaConsultoriaNotaFiscalTest() throws Exception{
		try {
			tnf = new TreinamentoNotaFiscal(null, 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser negativo ou vazio", e.getMessage());

		}

		try {
			tnf = new TreinamentoNotaFiscal("", 0);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser negativo ou vazio", e.getMessage());

		}
		
		try {
			tnf = new TreinamentoNotaFiscal("Bruna Barbosa", -1);
			fail();
		} catch (Exception e) {
			assertEquals("Valor da nota fiscal nao pode ser negativo", e.getMessage());
		}
		
		tnf = new TreinamentoNotaFiscal("Bruna Barbosa", 120);
		assertEquals(120, tnf.getValor(), 0);
	}
	
	@Test
	public void calculaImpostoConsultoriaTest() throws Exception{
		tnf = new TreinamentoNotaFiscal("Bruna Barbosa", 120.5);
		assertEquals(18.075, tnf.calculaImposto(), 0);
	}
}
