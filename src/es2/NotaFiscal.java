package es2;

public class NotaFiscal {

	private String nomeCliente;
	private double valor;
	private double imposto;
	public NotaFiscal(String nomeCliente, double valorNotaFiscal, double imposto) throws Exception {
		
		if(nomeCliente == null ||
				nomeCliente.isEmpty()){
			throw new Exception("Nome do cliente nao pode ser nulo ou vazio");
		}
		
		if(valorNotaFiscal < 0){
			throw new Exception("Valor da nota fiscal nao pode ser negativo");
		}
		
		if(imposto < 0){
			throw new Exception("Imposto nao pode ser negativo");
		}
		
		this.imposto = imposto;
		this.nomeCliente = nomeCliente;
		this.valor = valorNotaFiscal;
	}
	
	public String getNomeCliente(){
		return nomeCliente;
	}
	
	public void setNomeCliente(String novoNome){
		this.nomeCliente = novoNome;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double novoValor){
		this.valor = novoValor;
	}
	
	public double getImposto(){
		return imposto;
	}
	
	public void setImpostoServico(double imposto){
		this.imposto = imposto;
	}

}