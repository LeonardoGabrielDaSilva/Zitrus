package br.com.zitrus.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.zitrus.model.ClienteEndereco;
import br.com.zitrus.model.ClienteEnderecoId;

public interface ClienteEnderecoRepository extends JpaRepository<ClienteEndereco, ClienteEnderecoId> {

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM ClienteEndereco WHERE cliente_cpf = :cpf")
	void deleteByCliente_Cpf(@Param("cpf") String cpf);
	
	List<ClienteEndereco> findAllByCliente_Cpf(String cpf);
}
