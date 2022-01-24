package br.com.zitrus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@IdClass(ClienteEnderecoId.class)
@Entity
public class ClienteEndereco {

	@Id
	private int numero;
	@Id
	@ManyToOne
	private Cliente cliente;
	@Id
	@ManyToOne
	private Endereco endereco;

	public ClienteEndereco() {

	}

	public ClienteEndereco(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
