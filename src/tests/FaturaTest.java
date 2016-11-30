package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es2.Fatura;
import es2.Servico;

public class FaturaTest {

	Fatura ft;
	Servico s;
	
	@Before
	public void setUp() throws Exception{
		s = new Servico();
		ft = new Fatura("Bruna Barbosa", "Campina Grande - PB", 120);
	}
	
	@Test
	public void criaFaturaServicoGenericoTest() throws Exception{
		try {
			ft = new Fatura(null, "Campina Grande - PB", 120);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser vazio ou nulo", e.getMessage());
		}
		
		try {
			ft = new Fatura("", "Campina Grande - PB", 120);
			fail();
		} catch (Exception e) {
			assertEquals("Nome do cliente nao pode ser vazio ou nulo", e.getMessage());
		}
		
		try {
			ft = new Fatura("Bruna Barbosa", "Campina Grande - PB", s, -1);
			fail();
		} catch (Exception e) {
			assertEquals("Valor da fatura nao pode ser negativo", e.getMessage());
		}
		
		ft = new Fatura("Bruna Barbosa", "Campina Grande - PB", s, 0);
		assertEquals(0, ft.getValorFatura(), 0);
		
		ft = new Fatura("Bruna Barbosa", "Campina Grande - PB", s, 122.56);
		assertEquals(122.56, ft.getValorFatura(), 0);
		
	}
	
}
