package es2;

public class Fatura {

	private String nomeCliente;
	private String enderecoCliente;
	private ServicoEnum servico;
	private double valorFatura;
	
	public Fatura(String nomeCliente, String enderecoCliente, double valorFatura) throws Exception {
		if(nomeCliente == null ||
				nomeCliente.isEmpty()){
			throw new Exception("Nome do cliente nao pode ser vazio ou nulo");
		}
		if(valorFatura < 0){
			throw new Exception("Valor da fatura nao pode ser negativo");
		}
		
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.servico = ServicoEnum.IMPOSTO_DEFAULT;
		this.valorFatura = valorFatura;
	}
	
	public Fatura(String nomeCliente, String enderecoCliente, ServicoEnum servico, double valorFatura) throws Exception {
		this(nomeCliente, enderecoCliente, valorFatura);
		
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.servico = servico;
		this.valorFatura = valorFatura;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public ServicoEnum getServico() {
		return servico;
	}

	public void setServico(ServicoEnum servico) {
		this.servico = servico;
	}

	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}

	public double calculaImposto() {
		return (valorFatura * servico.valorImposto)/100;
	}


}
