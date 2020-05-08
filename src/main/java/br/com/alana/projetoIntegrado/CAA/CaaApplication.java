package br.com.alana.projetoIntegrado.CAA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;

@SpringBootApplication
public class CaaApplication implements CommandLineRunner{

	@Autowired
	UsuarioRepository repositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(CaaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		saveUsuario();
	}
	
	public void saveUsuario() {
		repositorio.deleteAll();
		
		List<Usuario> usuarioList = new ArrayList<>();
		Usuario user1 = new Usuario();
		user1.setNome("Alana Paula");
		user1.setIdade(22);
		user1.setCpf("061913671-81");

		Usuario user2 = new Usuario();
		user2.setNome("Debora Isabel");
		user2.setIdade(25);
		user2.setCpf("055915641-54");

		Usuario user3 = new Usuario();
		user3.setNome("Ana Rute");
		user3.setIdade(25);
		user3.setCpf("049953479-87");

		usuarioList.add(user1);
		usuarioList.add(user2);
		usuarioList.add(user3);

		for (Usuario usuario : usuarioList) {
			Usuario usuarioSaved = repositorio.save(usuario);
			System.out.println(usuarioSaved);
		}
		
		System.out.println(">>> "+repositorio.findByCpf("061913671-81"));

	}

}
