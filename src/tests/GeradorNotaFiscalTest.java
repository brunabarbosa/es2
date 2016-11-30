package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es2.Consultoria;
import es2.Fatura;
import es2.GeradorNotaFiscal;
import es2.NotaFiscal;
import es2.Treinamento;


public class GeradorNotaFiscalTest {
	
	NotaFiscal nf;
	Fatura faturaServicoGenerico;
	Fatura faturaServicoConsultoria;
	Fatura faturaServicoTreinamento;
	
	@Before
	public void setUp() throws Exception{
		faturaServicoGenerico = new Fatura("Bruna Barbosa", "Campina Grande - PB", 120);
		faturaServicoConsultoria= new Fatura("Bruna Barbosa", "Campina Grande - PB", 
				new Consultoria(), 120);
		faturaServicoTreinamento = new Fatura("Bruna Barbosa", "Campina Grande - PB", 
				new Treinamento(), 120);
	}


	//120 * 0.06
	@Test
	public void geraNotaFiscalServicoGenericoTest() throws Exception{
		nf = GeradorNotaFiscal.geraNotaFiscal(faturaServicoGenerico);
		assertEquals(7.2, nf.calculaImposto(), 0);
		
		
	}
	
	//120 * 25
	@Test
	public void geraNotaFiscalServicoConsultoriaTest() throws Exception{
		
		nf = GeradorNotaFiscal.geraNotaFiscal(faturaServicoConsultoria);
		assertEquals(30, nf.calculaImposto(), 0);
	}
	
	//120 * 15
	@Test
	public void geraNotaFiscalServicoTreinamentoTest() throws Exception{
		nf = GeradorNotaFiscal.geraNotaFiscal(faturaServicoTreinamento);
		assertEquals(18.0, nf.calculaImposto(), 0);
	}
	
}
