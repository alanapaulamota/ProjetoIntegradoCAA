package br.com.alana.projetoIntegrado.CAA.service;

import java.util.List;

import br.com.alana.projetoIntegrado.CAA.model.DicionarioHelp;

public interface DicionarioHelpService {

	List<DicionarioHelp> findAll();

	List<DicionarioHelp> findByPalavra(String palavra, String significado);

	DicionarioHelp findById(long id);

}
