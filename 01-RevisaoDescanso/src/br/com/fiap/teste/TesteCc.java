package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.bean.ContaCorrente;

public class TesteCc {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		
		System.out.print("Saldo Conta Corrente 1: ");
		cc1.setSaldo(scn.nextDouble());
		System.out.print("Saldo Conta Corrente 2: ");
		cc2.setSaldo(scn.nextDouble());
		System.out.print("Saldo Conta Corrente 3: ");
		cc3.setSaldo(scn.nextDouble());
		
		System.out.println("");
		
//		cc1.setSaldo(1000);
//		cc2.setSaldo(1500);
//		cc3.setSaldo(2500);
		
		List<ContaCorrente> cc = new ArrayList<ContaCorrente>();
		
		cc.add(cc1);
		cc.add(cc2);
		cc.add(cc3);
		
		for (ContaCorrente item : cc) {
			System.out.println("Saldo: " + item.getSaldo());
		}
		
	}
	
}
