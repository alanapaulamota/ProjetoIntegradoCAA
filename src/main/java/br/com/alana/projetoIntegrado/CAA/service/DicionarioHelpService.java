package br.com.alana.projetoIntegrado.CAA.service;

import java.util.List;

import br.com.alana.projetoIntegrado.CAA.model.HelpDicionario;

public interface DicionarioHelpService {

	List<HelpDicionario> findAll();

	List<HelpDicionario> findByPalavra(String palavra, String significado);

	HelpDicionario findById(long id);

}
