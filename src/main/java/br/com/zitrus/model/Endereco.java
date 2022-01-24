package br.com.zitrus.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {

	@Id
	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	private long ibge;

	public Endereco() {

	}

	public Endereco(String cep, String logradouro, String bairro, String localidade, String uf, int numero, long ibge) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public long getIbge() {
		return ibge;
	}

	public void setIbge(long ibge) {
		this.ibge = ibge;
	}

}
