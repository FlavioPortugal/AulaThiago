package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name = "clinte", sequenceName = "SQ_T_CLINTE", allocationSize=1)
public class Cliente {
	
	@Id
	@Column(name="cd_Cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private int codigo;
	
	//mappedBy -> atributo que mapeia a FK na Classe Cliente
	@OneToOne(mappedBy="cliente")
	private CarrinhoCompras carrinho;
	
	@Column(name = "nm_cliente", nullable = false, length=50)
	private String nome;
	
	@Column(name="nr_cpf", nullable = false)
	private String cpf;
	
	

}
