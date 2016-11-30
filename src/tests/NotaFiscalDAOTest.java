package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dao.NotaFiscalDAO;
import dao.SAP;
import dao.Smtp;
import es2.NotaFiscal;


public class NotaFiscalDAOTest {

	NotaFiscal nf;
	
	@Before
	public void SetUp() throws Exception{
		nf = new NotaFiscal("Bruna Barbosa", 125.2, 5);
	}
	
	@Test
	public void salvaNotaFiscalTest(){
		assertTrue(NotaFiscalDAO.salva(nf));
	}
	
	@Test
	public void enviaNotaFiscalSAPTest(){
		assertTrue(SAP.envia(nf));
	}
	
	@Test
	public void enviaNotaFiscalSmtpTest(){
		assertTrue(Smtp.envia(nf));
	}
}
