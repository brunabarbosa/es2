package es2;

public class NotaFiscal {

	private String nomeCliente;
	private double valor;
	private double imposto;
	public static final double IMPOSTO_DEFAULT = 6;
	
	
	public NotaFiscal(String nomeCliente, double d) throws Exception {
		
		if(nomeCliente == null ||
				nomeCliente.isEmpty()){
			throw new Exception("Nome do cliente nao pode ser negativo ou vazio");
		}
		
		if(d < 0){
			throw new Exception("Valor da nota fiscal nao pode ser negativo");
		}
		
		this.nomeCliente = nomeCliente;
		this.valor = d;
		imposto = IMPOSTO_DEFAULT;
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
	
	public void setImposto(double impostoConsultoria){
		this.imposto = impostoConsultoria;
	}

	public double calculaImposto() {
		return (getValor() * IMPOSTO_DEFAULT)/100;
	}
	
}
