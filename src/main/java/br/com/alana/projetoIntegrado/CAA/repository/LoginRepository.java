package br.com.alana.projetoIntegrado.CAA.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alana.projetoIntegrado.CAA.model.Login;

/* Classe Repositorio
*
*  
*
*Por extender a classe JpaRepository tem acesso a metodos do Spring Data ja prontos, por exemplo: CRUD, find all...
*/

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
	
	Optional<Login> findByCpf(String cpf); 	// busca por cpf na lista de Usuarios Logados

}
