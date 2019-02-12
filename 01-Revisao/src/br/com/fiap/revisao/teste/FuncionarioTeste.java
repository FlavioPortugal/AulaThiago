//80596

package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.bean.Gerente;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setSalario(900);
		
		Gerente g = new Gerente();
		g.setSalario(900);
		
		System.out.println(f.calcularBonificacao());
		System.out.println(g.calcularBonificacao());
		String salario = (f.getSalario()>1000)?"Maior":"Menor";
		System.out.println(salario);
	}
}
