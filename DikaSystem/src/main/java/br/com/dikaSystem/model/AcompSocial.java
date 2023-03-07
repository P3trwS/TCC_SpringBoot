package br.com.dikaSystem.model;


import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "AcompSocial")
public class AcompSocial extends Pessoa{
	
	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acompSocial")
	private long id;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dataCadastro;// data q foi feito o cadastro

	@Column(length = 255)
	private String filiacao; // pais...
    private String profissao;
    private String ocAtual; //Ocupação atual..
    private String filhosM; // filhos menores de Idade...
    private String qtdPessoas; // pessoas q moram na casa...
    private String qtdsTrabalham; // quantos Trabalham...
    private boolean auxGov; // auxilio governo...
    
    private String auxGovS;
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getOcAtual() {
		return ocAtual;
	}
	public void setOcAtual(String ocAtual) {
		this.ocAtual = ocAtual;
	}
	public String getFilhosM() {
		return filhosM;
	}
	public void setFilhosM(String filhosM) {
		this.filhosM = filhosM;
	}
	public String getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(String qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public String getQtdsTrabalham() {
		return qtdsTrabalham;
	}
	public void setQtdsTrabalham(String qtdsTrabalham) {
		this.qtdsTrabalham = qtdsTrabalham;
	}
	public boolean getAuxGov() {
		return auxGov;
	}
	public void setAuxGov(boolean auxGov) {
		this.auxGov = auxGov;
	}
	
	public String getAuxGovS() {
		return auxGovS;
	}
	public void setAuxGovS(String auxGovS) {
		this.auxGovS = auxGovS;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}