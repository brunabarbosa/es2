package dao;

import es2.NotaFiscal;

public class SAP {
	
	public static boolean envia(NotaFiscal nf) {
		/*Apenas para esse execicio, o BD sempre vai conseguir enviar a nota fiscal*/
		System.out.println("enviando pro sap");
		return true;
	}
}
