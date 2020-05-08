package br.com.alana.projetoIntegrado.CAA.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.service.UsuarioService;

@Controller
public class UsuarioController {

	UsuarioService servico;

	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public ModelAndView getUsuarios() {
		ModelAndView mv = new ModelAndView("usuarios");
		List<Usuario> usuarios = servico.findAll();
		mv.addObject("usuarios", usuarios);
		return mv;
	}
}
