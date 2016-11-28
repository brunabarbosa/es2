package es2;

public class TreinamentoNotaFiscal extends NotaFiscal{

	public static final double IMPOSTO_TREINAMENTO = 15;

	public TreinamentoNotaFiscal(String nomeCliente, double d) throws Exception{
		super(nomeCliente, d);
		super.setImposto(IMPOSTO_TREINAMENTO);
	}
	
	@Override
	public double calculaImposto() {
		return (getValor() * IMPOSTO_TREINAMENTO)/100;
	}
}
