package br.com.alana.projetoIntegrado.CAA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import static org.junit.Assert.assertThat
import br.com.alana.projetoIntegrado.CAA.model.HelpQuestion;

@Repository("")
public interface HelpQuestionsRepository extends JpaRepository<HelpQuestion, Long> {


	List<HelpQuestion> findByPerguntaContainingOrRespostaContaining(String pergunta,
			String resposta);

}
