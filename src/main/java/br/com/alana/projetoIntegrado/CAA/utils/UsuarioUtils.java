package br.com.alana.projetoIntegrado.CAA.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;

public class UsuarioUtils {

	@Autowired
	UsuarioRepository repositorio;

//	@PostConstruct  //TUDO QUE ESTIVER NO METODO VAI SER EXECUTADO ENQUANTO APLICACAO TIVER SUBINDO
	public void saveUsuario() {
		List<Usuario> usuarioList = new ArrayList<>();
		Usuario user1 = new Usuario();
		user1.setNome("Alana Paula");
		user1.setIdade("22");
		user1.setCpf("061913671-81");

		Usuario user2 = new Usuario();
		user1.setNome("Debora Isabel");
		user1.setIdade("25");
		user1.setCpf("055915641-54");

		Usuario user3 = new Usuario();
		user1.setNome("Ana Rute");
		user1.setIdade("25");
		user1.setCpf("049953479-87");

		usuarioList.add(user1);
		usuarioList.add(user2);
		usuarioList.add(user3);

		for (Usuario usuario : usuarioList) {
			Usuario usuarioSaved = repositorio.save(usuario);
			System.out.println(usuarioSaved.getId());
		}

	}
}
