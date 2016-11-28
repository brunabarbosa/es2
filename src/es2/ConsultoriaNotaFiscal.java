package es2;

public class ConsultoriaNotaFiscal extends NotaFiscal{

	public static final double IMPOSTO_CONSULTORIA = 25;

	public ConsultoriaNotaFiscal(String nomeCliente, double d) throws Exception{
		super(nomeCliente, d);
		super.setImposto(IMPOSTO_CONSULTORIA);
	}
	
	@Override
	public double calculaImposto() {
		return (getValor() * IMPOSTO_CONSULTORIA)/100;
	}
}
