package br.com.alana.projetoIntegrado.CAA.service;

import java.util.List;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;

public interface UsuarioService {

	List<Usuario> findAll();

	Usuario findById(long id);

	Usuario save(Usuario usuario);

}
