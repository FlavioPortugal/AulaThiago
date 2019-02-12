package br.com.fiap.bean;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;

	public static float rendimento;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(float taxa) {
		super();
		this.taxa = taxa;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public static float getRendimento() {
		return rendimento;
	}

	public static void setRendimento(float rendimento) {
		ContaPoupanca.rendimento = rendimento;
	}

	@Override
	public double depositar(double valor) {
		return saldo + valor;
	}

	@Override
	public double retirar(double valor) {
		
		if ((saldo-valor) > 0) {
			return saldo-valor-taxa;
		} else {
			System.out.println("Saldo insuficiente!");
			return saldo;
		}
	}
	
	@Override
	public double calculaRetornoInvestimento() {
		return saldo*rendimento;
	}
	
}
