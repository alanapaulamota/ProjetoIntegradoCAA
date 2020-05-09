package br.com.alana.projetoIntegrado.CAA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alana.projetoIntegrado.CAA.model.Login;
import br.com.alana.projetoIntegrado.CAA.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService servico;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.addAttribute("login", new Login());
		return "login";
	}

}
