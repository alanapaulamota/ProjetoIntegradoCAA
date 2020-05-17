package br.com.alana.projetoIntegrado.CAA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.alana.projetoIntegrado.CAA.model.CadastroUser;
import br.com.alana.projetoIntegrado.CAA.model.HelpQuestion;
import br.com.alana.projetoIntegrado.CAA.repository.CadastroRepository;
import br.com.alana.projetoIntegrado.CAA.repository.HelpQuestionsRepository;

/* Classe principal, serve pra subir a aplicação... 
*  
*/

@SpringBootApplication
public class CaaApplication extends SpringBootServletInitializer implements CommandLineRunner {

//	@Autowired
//	private HelpQuestionsRepository repository;

	@Autowired
	CadastroRepository repositorio;

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
		List<CadastroUser> usuarioList = new ArrayList<>();
		CadastroUser user1 = new CadastroUser();
		user1.setNome("Alana Paula");
		user1.setIdade(22);
		user1.setCpf("062.913.671-81");
		user1.setSenha("030626Df");
		user1.setEmail("alana@upis.com");

		CadastroUser user2 = new CadastroUser();
		user2.setNome("Debora Isabel");
		user2.setIdade(25);
		user2.setCpf("055.915.641-54");
		user2.setSenha("1234567Df");
		user2.setEmail("debora@upis.com");

		CadastroUser user3 = new CadastroUser();
		user3.setNome("Ana Rute");
		user3.setIdade(23);
		user3.setCpf("049.953.479-87");
		user3.setSenha("78945678Df");
		user3.setEmail("ana@upis.com");

		usuarioList.add(user1);
		usuarioList.add(user2);
		usuarioList.add(user3);

		for (CadastroUser cadastroUser : usuarioList) {
			CadastroUser usuarioSaved = repositorio.save(cadastroUser);
			System.out.println(usuarioSaved);
		}

		// teste:busca por CPF
		System.out.println(">>> " + repositorio.findByCpf("062.913.671-81"));

// TELA HELP

		List<HelpQuestion> perguntasAndRespostas = createQuestionsAndAnswers();

		helpRepository.saveAll(perguntasAndRespostas);

		System.out.println("\n\n\nProcurando perguntas sobre tela...");
		String query = "voltar";
		List<HelpQuestion> list = helpRepository.findByPerguntaContainingOrRespostaContaining(query, query);
		list.forEach(System.out::println);

	}

	private List<HelpQuestion> createQuestionsAndAnswers() {
		return List.of(new HelpQuestion("Como aumentar a tela?", "Para aumentar a tela basta selecionar aaa..."),
				new HelpQuestion("Como voltar pra tela de login", "Para voltar pra tela de login, basta..."),
				new HelpQuestion("aaa bbb ...", "tela"));
	}
}
