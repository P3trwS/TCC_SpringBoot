package br.com.dikaSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
@Entity
public class SituacaoDom {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_situacaoDom")
	private long id;
	
	@Column(name = "casaAlugada")
	private String casaA;//texto... Valor R$
	private boolean CasaAA; //ratio
	@Column(name = "casaCedida")
	private String casaB; //texto... por quanto tempo
	private boolean CasaBB;//ratio
	@Column(name = "casaPropria")
	private String casaC;//texto... Valor Parcela
	private boolean casaCC;//ratio
	
	private String casaAAS;
	private String casaBBS;
	private String casaCCS;
	
	private String bcpS;
	private String aposentadoriaS;
	private String auxDoencaS;
	private String pensaoS;
	
	//checkbox
	private boolean bcp;
	private boolean aposentadoria;
	private boolean auxDoenca;
	private boolean pensao;
	
	//texto
	@Column(name= "outros", length = 2000)
	private String outros;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCasaA() {
		return casaA;
	}

	public void setCasaA(String casaA) {
		this.casaA = casaA;
	}

	public String getCasaB() {
		return casaB;
	}

	public void setCasaB(String casaB) {
		this.casaB = casaB;
	}

	public boolean isCasaCC() {
		return casaCC;
	}

	public void setCasaCC(boolean casaCC) {
		this.casaCC = casaCC;
	}

	public String getCasaC() {
		return casaC;
	}

	public void setCasaC(String casaC) {
		this.casaC = casaC;
	}

	public boolean isBcp() {
		return bcp;
	}

	public void setBcp(boolean bcp) {
		this.bcp = bcp;
	}

	public boolean isAposentadoria() {
		return aposentadoria;
	}

	public void setAposentadoria(boolean aposentadoria) {
		this.aposentadoria = aposentadoria;
	}

	public boolean isAuxDoenca() {
		return auxDoenca;
	}

	public void setAuxDoenca(boolean auxDoenca) {
		this.auxDoenca = auxDoenca;
	}

	public boolean isPensao() {
		return pensao;
	}

	public void setPensao(boolean pensao) {
		this.pensao = pensao;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}

	public boolean isCasaAA() {
		return CasaAA;
	}

	public void setCasaAA(boolean casaAA) {
		CasaAA = casaAA;
	}

	public boolean isCasaBB() {
		return CasaBB;
	}

	public void setCasaBB(boolean casaBB) {
		CasaBB = casaBB;
	}

	
	public String getCasaAAS() {
		return casaAAS;
	}

	public void setCasaAAS(String casaAAS) {
		this.casaAAS = casaAAS;
	}

	public String getCasaBBS() {
		return casaBBS;
	}

	public void setCasaBBS(String casaBBS) {
		this.casaBBS = casaBBS;
	}

	public String getCasaCCS() {
		return casaCCS;
	}

	public void setCasaCCS(String casaCCS) {
		this.casaCCS = casaCCS;
	}

	public String getBcpS() {
		return bcpS;
	}

	public void setBcpS(String bcpS) {
		this.bcpS = bcpS;
	}

	public String getAposentadoriaS() {
		return aposentadoriaS;
	}

	public void setAposentadoriaS(String aposentadoriaS) {
		this.aposentadoriaS = aposentadoriaS;
	}

	public String getAuxDoencaS() {
		return auxDoencaS;
	}

	public void setAuxDoencaS(String auxDoencaS) {
		this.auxDoencaS = auxDoencaS;
	}

	public String getPensaoS() {
		return pensaoS;
	}

	public void setPensaoS(String pensaoS) {
		this.pensaoS = pensaoS;
	}
}
