package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.alana.projetoIntegrado.CAA.model.HelpQuestion;
import br.com.alana.projetoIntegrado.CAA.repository.HelpQuestionsRepository;
import br.com.alana.projetoIntegrado.CAA.service.HelpQuestionService;

public class HelpQuestionServiceImpl implements HelpQuestionService {

	@Autowired
	HelpQuestionsRepository repositorio;

	@Override
	public HelpQuestion findById(long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public List<HelpQuestion> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<HelpQuestion> findByPergunta(String pergunta, String resposta) {
		return repositorio.findByPerguntaContainingOrRespostaContaining(pergunta, resposta);
	}

}
