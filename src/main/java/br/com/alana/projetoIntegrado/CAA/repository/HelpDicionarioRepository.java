package br.com.alana.projetoIntegrado.CAA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alana.projetoIntegrado.CAA.model.HelpDicionario;

public interface HelpDicionarioRepository extends JpaRepository<HelpDicionario, Long> {

	List<HelpDicionario> findByPalavraContainingOrSignificadoContaining(String palavra, String significado);

}
