
package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario {
	
	// Sobrescrita do método - Polimorfismo
	@Override
	public double calcularBonificacao() {
		return salario*2;
	}
	
	// Invocado quando o objeto é passado no sysout
	@Override
	public String toString() {
		return "Salário: " + salario;
	}
	
}
