package br.com.alana.projetoIntegrado.CAA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alana.projetoIntegrado.CAA.model.CadastroUser;
import br.com.alana.projetoIntegrado.CAA.service.CadastroService;

/*
 * Bean gerenciado pelo Spring 
 */

@Controller // Define que minha classe será um controller
public class CadastroController {

	// Ponto de injeção para conseguir usar os metodos implementados no
	// CadastroService
	@Autowired
	CadastroService servico;

	@RequestMapping(value = "/", method = RequestMethod.GET) // anotação responsável pelo processamento da URL mapeada,
																// requisição GET -> transforma em action

	public String showUsuarioPage(ModelMap model) { // Model é um auxiliar que ajuda a adicionar atributos a nossa view,
													// o ModelMap é uma extensao do Model com capacidade de armazenar
													// atributos em um mapa e em chamadas de método em cadeia.

		model.addAttribute("indexCadastro", new CadastroUser()); // adicionando atributos a view
		return "indexCadastro"; // Retorna a view (indexCadastro.html) que deve ser chamada (.jsp é omitido)
	}

	@RequestMapping(value = "/saveUsuario", method = RequestMethod.POST) // mapeamento da URL, requisição POST
	public String save(ModelMap model, CadastroUser cadastroUser, BindingResult result) { // BindingResult auxilia na
																							// validação
		// durante o processo de binding, caso
		// haja algum erro,é redirecionado pra
		// pagina indicada
		if (result.hasErrors()) {
			return "indexCadastro"; // Retorna a view (indexCadastro.jsp) que deve ser chamada (.jsp é omitido)
		}

		servico.save(cadastroUser); // chama a classe de servico e salva o usuario cadastrado

		return "redirect:/indexLogin"; // Faz redirecionamento da tela de cadastro pra tela de login (.jsp é omitido)
	}

}
