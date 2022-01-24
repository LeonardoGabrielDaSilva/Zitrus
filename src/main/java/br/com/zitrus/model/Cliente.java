package br.com.zitrus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {

	@Id
	private String cpf;
	private String nome;
	private String genero;
	private String email;
	private long telefone;
	@ManyToOne
	private Endereco endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String cpf, String nome, String genero, String email, long telefone, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.genero = genero;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
