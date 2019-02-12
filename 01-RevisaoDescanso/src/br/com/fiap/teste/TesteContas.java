package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class TesteContas {

	public static void main(String[] args) {
		
		//Instanciando objetos
		ContaCorrente cc = new ContaCorrente(1,2, new GregorianCalendar(1999,Calendar.AUGUST,2),1000,TipoConta.PREMIUM);
		ContaPoupanca cp = new ContaPoupanca(1,3,Calendar.getInstance(),5000,1);
		
		//CC
		cc.setSaldo(1000);
		cc.setTipo(TipoConta.COMUM);
		System.out.println(cc.depositar(100));
		System.out.println("");

		System.out.println("");
	
		
		//CP
		cp.setSaldo(500);
		cp.setTaxa(5);
		cp.setRendimento(0); // Finish later!!!!
	}
	
}
