package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TBL_PASTEL") //N�o � obrigat�ria, altera o nome da tabela
// name deve ser igual ao par�metro na anota��o GeneratedValue abaixo
// sequenceName deve ser igual ao nome o banco de dados
// allocationSize indica o passo no qual o c�digo deve ser gerado
@SequenceGenerator(name="pastel",sequenceName="SQ_TBL_PASTEL",allocationSize=1)
public class Pastel {

	@Id
	@GeneratedValue(generator="pastel", strategy=GenerationType.SEQUENCE) //Gera um valor autom�ticamente para o c�digo
	private int codigo;
	
	@Column(name="ds_sabor",nullable=false,length=50)
	private String sabor;
	
	@Column(name="vl_pastel",nullable=false)
	private float preco;
	
	@Column(name="is_especial")
	private boolean especial;
	
	@Column(name="ds_massa")
	@Enumerated(EnumType.STRING) // grava a constante no banco, e n�o a ordem
	private Massa massa;
	
	@CreationTimestamp // gera a data de cadastro autom�ticamente
	private Calendar dataCadastro;
	
	@Temporal(TemporalType.TIMESTAMP) // data e as horas
	private Calendar dataPedido;
	
	@Transient // Impede este atributo de virar coluna no banco de dados
	private int numeroComanda;
	
	@Lob // Utilizado para indicar entada de dados de grande dimens�o no banco (imagens, etc)
	private byte[] foto;
	
}
