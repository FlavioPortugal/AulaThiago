package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PRODUTO")
@SequenceGenerator(name = "cliente", sequenceName= "SQ_T_Produto",allocationSize=1)
public class Produto {

	@Id
	@Column(name="cd_Produto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor")
	private int codigo;
	
	@OneToMany(mappedBy="produto")	
	private List<ItemCarrinho> itemCarrinho;
	
	@Column(name = "nm_poduto", nullable = false, length=50)
	private String nome;
	
	@Column(name="vl_total", nullable = false)
	private double valor;
	
}
