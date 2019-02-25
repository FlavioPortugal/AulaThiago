package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_Motorista")
public class Motorista {
	
	@Id
	@Column(name="nr_carteira")
	private int codigo;
	
	@Column(name="nm_motorista",nullable=false,length=150)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	@Lob
	private Byte[] carteira;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero")
	private TipoGenero genero;

	public Motorista() {
		super();
	}

	public Motorista(int codigo, String nome, Calendar dataNascimento, Byte[] carteira, TipoGenero genero) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.carteira = carteira;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Byte[] getCarteira() {
		return carteira;
	}

	public void setCarteira(Byte[] carteira) {
		this.carteira = carteira;
	}

	public TipoGenero getGenero() {
		return genero;
	}

	public void setGenero(TipoGenero genero) {
		this.genero = genero;
	}
	
	

}
