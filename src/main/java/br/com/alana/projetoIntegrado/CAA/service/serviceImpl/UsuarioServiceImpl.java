package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;
import br.com.alana.projetoIntegrado.CAA.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository repositorio;

	@Override
	public List<Usuario> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Usuario findById(long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return repositorio.save(usuario);
	}

}
