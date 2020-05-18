package br.com.alana.projetoIntegrado.CAA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alana.projetoIntegrado.CAA.model.DicionarioHelp;

public interface DicionarioHelpRepository extends JpaRepository<DicionarioHelp, Long> {

	List<DicionarioHelp> findByPalavraContainingOrSignificadoContaining(String palavra, String significado);

}
