package br.com.alana.projetoIntegrado.CAA.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
//transacoes com BD -> METODOS CRUDS PRONTOS

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// busca por cpf na lista de Usuarios
	Optional<Usuario> findByCpf(String cpf);

}
