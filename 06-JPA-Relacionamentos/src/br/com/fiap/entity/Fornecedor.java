package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_Fornecedor")
@SequenceGenerator(name = "cliente", sequenceName= "SQ_T_Fornecedor",allocationSize=1)
public class Fornecedor {

	@Id
	@Column(name="cd_fornecedor")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor")
	private int codigo;
	
	@Column(name = "nm_fornecedor", nullable = false, length=50)
	private String nome;
	
	@Column
	private String cnpj;
	
}
