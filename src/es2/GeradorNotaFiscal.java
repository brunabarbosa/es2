package es2;


public class GeradorNotaFiscal {

	public static NotaFiscal geraNotaFiscal(Fatura fatura) throws Exception {
		
		return new NotaFiscal(fatura.getNomeCliente(), 
				fatura.getValorFatura(), fatura.calculaImposto());
	}


}
