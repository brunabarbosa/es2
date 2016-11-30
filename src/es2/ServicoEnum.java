package es2;

public enum ServicoEnum {

	IMPOSTO_DEFAULT(6), IMPOSTO_CONSULTORIA(25),
	IMPOSTO_TREINAMENTO(15);
	
	public int valorImposto;
	
	ServicoEnum(int valorImposto){
		this.valorImposto = valorImposto;
	}
}
