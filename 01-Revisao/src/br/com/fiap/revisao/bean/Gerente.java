//80596

package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario {
	
	// Sobrescrita do m�todo - Polimorfismo
	@Override
	public double calcularBonificacao() {
		return salario*2;
	}
	
	// Invocado quando o objeto � passado no sysout
	@Override
	public String toString() {
		return "Sal�rio: " + salario;
	}
	
}
