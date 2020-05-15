package br.com.alana.projetoIntegrado.CAA.service;

import java.util.List;

import br.com.alana.projetoIntegrado.CAA.model.HelpQuestion;

public interface HelpQuestionService {

	List<HelpQuestion> findAll();

	List<HelpQuestion> findByPergunta(String pergunta, String resposta);

	HelpQuestion findById(long id);

}
