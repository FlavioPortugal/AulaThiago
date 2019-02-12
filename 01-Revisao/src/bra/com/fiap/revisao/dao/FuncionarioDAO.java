
package bra.com.fiap.revisao.dao;

import java.io.Serializable;

import br.com.fiap.revisao.bean.Funcionario;

//Pode herdar uma ou mais classes, mas não pode implementar uma interface
public interface FuncionarioDAO extends Serializable, Comparable {

	public void cadastrar(Funcionario f);
	public void atualizar(Funcionario f);
	public void remover(int id);
}
