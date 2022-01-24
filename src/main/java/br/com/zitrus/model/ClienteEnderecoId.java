package br.com.zitrus.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ClienteEnderecoId implements Serializable {

	private int numero;
	private String cliente;
	private String endereco;

	public ClienteEnderecoId() {
		super();
	}

	public ClienteEnderecoId(int numero, String cliente, String endereco) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
