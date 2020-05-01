package br.com.alana.projetoIntegrado.CAA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alana.projetoIntegrado.CAA.domain.Usuario;
import br.com.alana.projetoIntegrado.CAA.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;

	public Usuario buscar(Integer id) {
		Usuario obj = repositorio.findById(id);
		return obj;

	}

}
