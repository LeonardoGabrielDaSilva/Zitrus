package br.com.zitrus.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.zitrus.model.Cliente;
import br.com.zitrus.model.ClienteEndereco;
import br.com.zitrus.model.ClienteEnderecoId;
import br.com.zitrus.model.Endereco;

public class ClienteEnderecoDto {

	@NotEmpty
	@Size(min=11, max=11)
	private String cpf;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String genero;
	@Email
	private String email;
	@Min(1)
	private long telefone;
	@NotEmpty
	@Size(min=8, max=8)
	private String cep;
	@NotEmpty
	private String logradouro;
	@NotEmpty
	private String bairro;
	@NotEmpty
	private String localidade;
	@NotEmpty
	private String uf;
	@Min(1000000) @Max(9999999)
	private long ibge;
	@Min(1) @Max(99999)
	private int numero;

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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente toCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		cliente.setGenero(genero);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEndereco(toEndereco());
		return cliente;
	}

	public Endereco toEndereco() {
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		endereco.setIbge(ibge);
		endereco.setLocalidade(localidade);
		endereco.setLogradouro(logradouro);
		endereco.setUf(uf);
		return endereco;
	}

	public ClienteEndereco toClienteEndereco() {
		ClienteEndereco ce = new ClienteEndereco();
		ce.setNumero(numero);
		ce.setCliente(toCliente());
		ce.setEndereco(toEndereco());
		return ce;
	}
	
	public ClienteEnderecoId toClienteEnderecoId() {
		ClienteEnderecoId ceId = new ClienteEnderecoId();
		ceId.setCliente(cpf);
		ceId.setEndereco(cep);
		ceId.setNumero(numero);
		return ceId;
	}
	
	public void setEndereco(Endereco endereco) {
		this.bairro = endereco.getBairro();
		this.localidade = endereco.getLocalidade();
		this.ibge = endereco.getIbge();
		this.logradouro = endereco.getLogradouro();
		this.uf = endereco.getUf();
	}

}
