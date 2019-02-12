package br.com.fiap.bean;

public class ContaCorrente extends Conta {

	private TipoConta tipo;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(TipoConta tipo) {
		super();
		this.setTipo(tipo);
	}
	
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public double depositar(double valor) {
		return saldo+=valor;
	}

	@Override
	public double retirar(double valor) {
		if (getTipo() == TipoConta.COMUM && (saldo-valor)<0) {
			System.out.println("Saldo final negativo!");
			return saldo;
		} else {
			return saldo-valor;
		}
	}

}
