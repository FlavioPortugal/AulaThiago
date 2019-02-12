package br.com.fiap.teste;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class TesteContas {

	public static void main(String[] args) {
		
		//Instanciando objetos
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		//CC
		cc.setSaldo(1000);
		cc.setTipo(TipoConta.COMUM);
		System.out.println(cc.depositar(100));
		System.out.println("");
		System.out.println(cc.retirar(1200));
		System.out.println("");
		System.out.println(cc.retirar(200));
		
		//CP
		cp.setSaldo(500);
		cp.setTaxa(5);
		cp.setRendimento(0); // Finish later!!!!
	}
	
}
