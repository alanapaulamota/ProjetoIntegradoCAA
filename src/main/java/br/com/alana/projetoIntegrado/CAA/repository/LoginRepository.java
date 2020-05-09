package br.com.alana.projetoIntegrado.CAA.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alana.projetoIntegrado.CAA.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	// busca por cpf na lista de Usuarios Logados
	Optional<Login> findByCpf(String cpf);

}
