package es2;

public class Fatura {

	private String mNomeCliente;
	private String mEnderecoCliente;
	private ServicoEnum mServico;
	private double mSalorFatura;
	
	public Fatura(String nomeCliente, String enderecoCliente, double valorFatura) throws Exception {
		
		setNomeCliente(nomeCliente);
		setValorFatura(valorFatura);
		setEnderecoCliente(enderecoCliente);
		this.mServico = ServicoEnum.IMPOSTO_DEFAULT;
	}
	
	public Fatura(String nomeCliente, String enderecoCliente, ServicoEnum servico, double valorFatura) throws Exception {
		this(nomeCliente, enderecoCliente, valorFatura);
		this.mServico = servico;
	}
	
	public String getNomeCliente() {
		return mNomeCliente;
	}

	public void setNomeCliente(String nomeCliente) throws Exception {
		if(nomeCliente == null ||
				nomeCliente.isEmpty()){
			throw new Exception("Nome do cliente nao pode ser vazio ou nulo");
		}
		mNomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return mEnderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.mEnderecoCliente = enderecoCliente;
	}

	public ServicoEnum getServico() {
		return mServico;
	}

	public void setServico(ServicoEnum servico) {
		this.mServico = servico;
	}

	public double getValorFatura() {
		return mSalorFatura;
	}

	public void setValorFatura(double valorFatura) throws Exception {
		if(valorFatura < 0){
			throw new Exception("Valor da fatura nao pode ser negativo");
		}
		mSalorFatura = valorFatura;
	}

	public double calculaImposto() {
		return (getValorFatura() * getServico().valorImposto)/100;
	}


}
