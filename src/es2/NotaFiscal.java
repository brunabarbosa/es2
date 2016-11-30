package es2;

/**
 * Classe responsavel por manipular as notas fiscais
 * @author Bruna Barbosa
 *
 */
public class NotaFiscal {

	private String mNomeCliente;
	private double mValor;
	private double mImposto;
	public NotaFiscal(String nomeCliente, double valorNotaFiscal, double imposto) throws Exception {
		
		setNomeCliente(nomeCliente);
		setValor(valorNotaFiscal);
		setImpostoServico(imposto);
	}
	
	public String getNomeCliente(){
		return mNomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) throws Exception{
		if(nomeCliente == null ||
				nomeCliente.isEmpty()){
			throw new Exception("Nome do cliente nao pode ser nulo ou vazio");
		}
		mNomeCliente = nomeCliente;
	}
	
	public double getValor(){
		return mValor;
	}
	
	public void setValor(double valorNotaFiscal) throws Exception{
		if(valorNotaFiscal < 0){
			throw new Exception("Valor da nota fiscal nao pode ser negativo");
		}
		mValor = valorNotaFiscal;
	}
	
	public double getImposto(){
		return mImposto;
	}
	
	public void setImpostoServico(double imposto) throws Exception{
		if(imposto < 0){
			throw new Exception("Imposto nao pode ser negativo");
		}
		mImposto = imposto;
	}

}