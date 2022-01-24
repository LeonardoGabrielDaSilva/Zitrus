package br.com.zitrus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zitrus.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
