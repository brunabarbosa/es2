package dao;

import es2.NotaFiscal;

public class NotaFiscalDAO {
	
	public static boolean salva(NotaFiscal nf) { 
		/*Apenas para esse execicio, o BD sempre vai conseguir salvar a nota fiscal*/
		System.out.println("salvando no banco");
		return true;
	}
}






