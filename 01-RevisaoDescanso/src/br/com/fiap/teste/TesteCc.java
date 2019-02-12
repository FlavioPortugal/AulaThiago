package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

public class TesteCc {

	public static void main(String[] args) {

		List<ContaCorrente> lista = new ArrayList<>();

		lista.add(new ContaCorrente(1, 2, new GregorianCalendar(2010, Calendar.APRIL, 20), 100, TipoConta.COMUM));

		lista.add(new ContaCorrente(1, 3, new GregorianCalendar(2010, Calendar.APRIL, 25), 5000, TipoConta.COMUM));

		lista.add(new ContaCorrente(1, 4, Calendar.getInstance(), 0, TipoConta.COMUM));

		for (ContaCorrente cc : lista) {
			System.out.println(cc);
		}

	}

}
