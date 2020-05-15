package br.com.alana.projetoIntegrado.CAA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.alana.projetoIntegrado.CAA.model.HelpQuestion;
import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.HelpQuestionsRepository;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;

/* Classe principal, serve pra subir a aplicação... 
*  
*/

@SpringBootApplication
public class CaaApplication extends SpringBootServletInitializer implements CommandLineRunner {

//	@Autowired
//	private HelpQuestionsRepository repository;

	@Autowired
	UsuarioRepository repositorio;

	@Autowired
	HelpQuestionsRepository helpRepository;

	public static void main(String[] args) {
		SpringApplication.run(CaaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CaaApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
		saveUsuario();
	}

	// Teste: Apaga todos os usuarios cadastrados no site, deixando apenas os
	// cadastrados abaixo ao subir a aplicacao
	public void saveUsuario() {
		repositorio.deleteAll();
		helpRepository.deleteAll();

		// Fazendo testes de que ta salvando realmente no banco de dados
		List<Usuario> usuarioList = new ArrayList<>();
		Usuario user1 = new Usuario();
		user1.setNome("Alana Paula");
		user1.setIdade(22);
		user1.setCpf("06291367181");
		user1.setSenha("aaa");

		Usuario user2 = new Usuario();
		user2.setNome("Debora Isabel");
		user2.setIdade(25);
		user2.setCpf("055915641-54");
		user2.setSenha("bbb");

		Usuario user3 = new Usuario();
		user3.setNome("Ana Rute");
		user3.setIdade(23);
		user3.setCpf("049953479-87");
		user3.setSenha("ccc");

		usuarioList.add(user1);
		usuarioList.add(user2);
		usuarioList.add(user3);

		for (Usuario usuario : usuarioList) {
			Usuario usuarioSaved = repositorio.save(usuario);
			System.out.println(usuarioSaved);
		}

		// teste:busca por CPF
		System.out.println(">>> " + repositorio.findByCpf("061913671-81"));

// TELA HELP

		List<HelpQuestion> perguntasAndRespostas = createQuestionsAndAnswers();

		helpRepository.saveAll(perguntasAndRespostas);

		System.out.println("\n\n\nProcurando perguntas sobre tela...");
		String query = "voltar";
		List<HelpQuestion> list = helpRepository
				.findByPerguntaContainingOrRespostaContaining(query, query);
		list.forEach(System.out::println);

	}

	private List<HelpQuestion> createQuestionsAndAnswers() {
		return List.of(new HelpQuestion("Como aumentar a tela?", "Para aumentar a tela basta selecionar aaa..."),
				new HelpQuestion("Como voltar pra tela de login", "Para voltar pra tela de login, basta..."),
				new HelpQuestion("aaa bbb ...", "tela"));
	}
}
