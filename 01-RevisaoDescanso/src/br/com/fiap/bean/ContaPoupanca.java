package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;

	public static float rendimento = 0.4f;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(float taxa) {
		super();
		this.taxa = taxa;
	}
		

	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
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
	public double retirar(double valor)throws Exception {
		
		if (saldo<valor) {
			throw new Exception("Saldo Insuficiente");
		} 
		return saldo -= valor+ taxa;
	}
	
	@Override
	public double calculaRetornoInvestimento() {
		return saldo*rendimento;
	}
	
}
