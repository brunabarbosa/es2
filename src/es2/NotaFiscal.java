package es2;

public class NotaFiscal {

	private String nomeCliente;
	private double valor;
	private double impostoServico;
	public NotaFiscal(String nomeCliente, double valorNotaFiscal, double impostoServico) throws Exception {
		
		if(nomeCliente == null ||
				nomeCliente.isEmpty()){
			throw new Exception("Nome do cliente nao pode ser nulo ou vazio");
		}
		
		if(valorNotaFiscal < 0){
			throw new Exception("Valor da nota fiscal nao pode ser negativo");
		}
		
		if(impostoServico < 0){
			throw new Exception("Imposto nao pode ser negativo");
		}
		
		this.impostoServico = impostoServico;
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
	
	public double getImpostoServico(){
		return impostoServico;
	}
	
	public void setImpostoServico(double impostoServico){
		this.impostoServico = impostoServico;
	}

	public double calculaImposto() {
		return (getValor() * getImpostoServico())/100;
	}

}