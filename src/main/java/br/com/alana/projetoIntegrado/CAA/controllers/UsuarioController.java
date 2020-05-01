package br.com.alana.projetoIntegrado.CAA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alana.projetoIntegrado.CAA.domain.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.GET)
	public String form() {
		return "TELA/formTela"; // NOME DA TELA HTML -> https://www.youtube.com/watch?v=8nw7qeCr1MM
	}

	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
	public String form(Usuario usuario) {
		repository.save(usuario);
		return "redirect:/cadastrarUsuario"; // NOME DA TELA HTML -> https://www.youtube.com/watch?v=8nw7qeCr1MM
	}
}
