package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;
import br.com.alana.projetoIntegrado.CAA.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	// Ponto de injeção para conseguir usar as instãncias do repositório
	// UsuarioRepository
	@Autowired
	UsuarioRepository repositorio;

	// Metodos implementados da interface UsuarioService
	@Override
	public List<Usuario> findAll() {
		return repositorio.findAll(); // busca todos Usuarios cadastrados
	}

	@Override
	public Usuario findById(long id) {
		return repositorio.findById(id).get(); // .get() serve para o obter o Usuario, e não um Optional (repositorio)
												// de Usuario
	}

	@Override
	public Usuario save(Usuario usuario) { // metodo save ultilizando metodo save do jpa Repository e passar o usuario
											// que ta recebendo como parametro
		return repositorio.save(usuario);
	}

}
