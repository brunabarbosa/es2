package es2;

/**
 * Classe responsavel por transformar faturas em notas fiscais
 * @author Bruna Barbosa
 *
 */
public class GeradorNotaFiscal {

	/**
	 * Recebe uma fatura e a retorna em forma de nota fiscal
	 * @param fatura
	 * @return notaFiscal
	 * @throws Exception
	 */
	public static NotaFiscal geraNotaFiscal(Fatura fatura) throws Exception {
		
		return new NotaFiscal(fatura.getNomeCliente(), 
				fatura.getValorFatura(), fatura.calculaImposto());
	}


}
