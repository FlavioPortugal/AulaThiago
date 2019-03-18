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

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="T_ITEM_CARRINHO")
@SequenceGenerator(name = "item", sequenceName = "SQ_T_ITEM_CARRINHO", allocationSize=1)
public class ItemCarrinho {

	@Id
	@Column(name="cd_ItemCarrinho")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itemCarrinho")
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name = "cd_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "cd_carrinho")
	private CarrinhoCompras carrinho;
	
	@Column(name="nr_itens")
	private int quantidade;
	
	@Column(name="vl_item", nullable = false)
	private double valor;
	
}
