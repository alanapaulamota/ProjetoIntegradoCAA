package br.com.alana.projetoIntegrado.CAA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alana.projetoIntegrado.CAA.model.HelpQuestion;
import br.com.alana.projetoIntegrado.CAA.service.HelpQuestionService;

public class HelpQuestionController {

	// Ponto de injeção para conseguir usar os metodos implementados
	// no HelpQuestionService
	@Autowired
	HelpQuestionService servico;

	@RequestMapping(value = "/telaHelp", method = RequestMethod.GET) // anotação responsável pelo processamento da URL
																		// mapeada -> transforma em action

	public String showHelpQuestionPage(ModelMap model) { // Model é um auxiliar que ajuda a adicionar atributos a nossa view,
		// o ModelMap é uma extensao do Model com capacidade de armazenar
		// atributos em um mapa e em chamadas de método em cadeia.

		model.addAttribute("telaHelp", new HelpQuestion()); // adicionando atributos a view
		return "telaHelp"; // Retorna a view (login.jsp) que deve ser chamada (.jsp é omitido)
	}

}
