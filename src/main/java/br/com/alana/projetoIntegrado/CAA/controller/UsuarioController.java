package br.com.alana.projetoIntegrado.CAA.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/list")
    public String listOfEmployee(Model model) {
          List<Usuario> lista = servico.findAll().stream().sorted(Comparator.comparing(Usuario::getNome)).collect(Collectors.toList());
          model.addAttribute("listaUsuarios", lista);
          return "lista";
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(ModelMap model, Usuario usuario, BindingResult result) {
		if (result.hasErrors()) {
			return "usuario";
		}

		servico.save(usuario);
		
		return "redirect:/list";
	}

}
