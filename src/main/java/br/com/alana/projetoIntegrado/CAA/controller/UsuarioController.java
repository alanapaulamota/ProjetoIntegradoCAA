package br.com.alana.projetoIntegrado.CAA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.service.UsuarioService;

/*
 * Bean gerenciado pelo Spring 
 */

@Controller // Define que minha classe será um controller
public class UsuarioController {

	// Ponto de injeção para conseguir usar os metodos implementados no
	// UsuarioService
	@Autowired
	UsuarioService servico;

	@RequestMapping(value = "/", method = RequestMethod.GET) // anotação responsável pelo processamento da URL mapeada,
																// requisição GET -> transforma em action

	public String showUsuarioPage(ModelMap model) { // Model é um auxiliar que ajuda a adicionar atributos a nossa view,
													// o ModelMap é uma extensao do Model com capacidade de armazenar
													// atributos em um mapa e em chamadas de método em cadeia.

		model.addAttribute("usuario", new Usuario()); // adicionando atributos a view
		return "usuario"; // Retorna a view (usuario.jsp) que deve ser chamada (.jsp é omitido)
	}

	@RequestMapping(value = "/saveUsuario", method = RequestMethod.POST) // mapeamento da URL, requisição POST
	public String save(ModelMap model, Usuario usuario, BindingResult result) { // BindingResult auxilia na validação
																				// durante o processo de binding, caso
																				// haja algum erro,é redirecionado pra
																				// pagina indicada
		if (result.hasErrors()) {
			return "usuario"; // Retorna a view (usuario.jsp) que deve ser chamada (.jsp é omitido)
		}

		servico.save(usuario); // chama a classe de servico e salva o usuario cadastrado

		return "redirect:/login"; // Faz redirecionamento da tela de cadastro pra tela de login (.jsp é omitido)
	}

}
