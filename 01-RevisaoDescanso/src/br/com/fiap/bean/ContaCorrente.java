package br.com.fiap.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaCorrente extends Conta {

	private TipoConta tipo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(TipoConta tipo) {
		super();
		this.tipo = tipo;
	}

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	

	@Override
	public double retirar(double valor) throws Exception {
		if (tipo == TipoConta.COMUM && saldo < valor) {
			throw new Exception("Saldo Insuficiente");
		}
		saldo -= valor;
		return saldo;

	}

	public String toString() {
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		return "Agencia: " + getAgencia() + "\n" + 
					"Número: " + getNumero() + "\n" + "Tipo: " + getTipo() + "\n"
				+ "Data Abertura: " + sdf.format(getDataAbertura().getTime()) + "\n";
	}

}
