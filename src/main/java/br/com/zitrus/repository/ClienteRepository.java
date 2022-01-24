package br.com.zitrus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zitrus.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

	

}
