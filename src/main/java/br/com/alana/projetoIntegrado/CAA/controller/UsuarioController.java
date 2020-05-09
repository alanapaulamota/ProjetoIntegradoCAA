package br.com.alana.projetoIntegrado.CAA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService servico;

//TODO finalizar controller

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario";
	}

	@RequestMapping(value = "/saveUsuario", method = RequestMethod.POST)
	public String save(ModelMap model, Usuario usuario, BindingResult result) {
		if (result.hasErrors()) {
			return "usuario";
		}

		servico.save(usuario);

		return "redirect:/login";
	}

}
