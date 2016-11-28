package es2;

class NotaFiscalDao {
	public void salva(NotaFiscal nf) { 
		System.out.println("salvando no banco"); 
	}
}


class SAP {
	public void envia(NotaFiscal nf) { 
		System.out.println("enviando pro sap"); 
	}
}


class Smtp {
	public void envia(NotaFiscal nf) { 
		System.out.println("enviando por email"); 
	}
}
