package br.com.dikaSystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class Pessoa {
		
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@DateTimeFormat(pattern = "dd/mm/yyyy")
	    private Date dataN;
		
		@Column(length = 255)
	 	private String nome;
	    private int idade;
	    private String rg;
	    private String cpf;
	    private String telefone;
	    private String endereco;

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public Date getDataN() {
			return dataN;
		}

		public void setDataN(Date dataN) {
			this.dataN = dataN;
		}
}
