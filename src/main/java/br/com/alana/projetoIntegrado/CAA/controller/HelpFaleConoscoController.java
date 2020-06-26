////package br.com.alana.projetoIntegrado.CAA.controller;
////
////import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import br.com.alana.projetoIntegrado.CAA.model.HelpFaleConosco;
//import br.com.alana.projetoIntegrado.CAA.service.HelpFaleConoscoService;
//
////https://www.youtube.com/watch?v=_fu0qeCo4h8
////FINALIZAR QND HTML ESTIVER PRONTO!! -> REQUEST MAPPING
//
////@Controller
////@RequestMapping("fale_conosco")
////public class HelpFaleConoscoController {
//
////	@RequestMapping(method = RequestMethod.GET)
////	public String showFaleConoscoPage(ModelMap model) {
////		model.put("fale_conosco", new HelpFaleConosco());
////		return "fale_conosco/index";
////
////	}
////
////	@RequestMapping(value = "send", method = RequestMethod.POST)
////	public String send(@ModelAttribute("fale_conosco") HelpFaleConosco faleConosco, ModelMap model) {
////		try {
////			HelpFaleConoscoService.send(faleConosco.getEmail(), "alanapaula.job@gmail.com", faleConosco.getTexto(), texto);
////			model.put("msg", "ok");
////
////		} catch (Exception e) {
////			model.put("errors", e.getMessage());
////		}
////		return "fale_conosco/index";
////
////	}
////}
