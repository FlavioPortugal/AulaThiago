package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.anotacao.Coluna;


public class Pessoa {
	
	@Coluna(nome="nm_pessoa",tipo="VARCHAR2")
	private String nome;
	
	@Coluna(nome="dt_dataNascimento",tipo=("DATE"))
	private Calendar dataNascimento;
	
	@Coluna(nome="vl_peso",tipo="NUMBER")
	private float peso;

	@SuppressWarnings("all") //Last case scenario. Not to be taken lightly
	public void falar() {
		int idade;
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
}
