package br.com.alana.projetoIntegrado.CAA.Resouce;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alana.projetoIntegrado.CAA.domain.Usuario;
import br.com.alana.projetoIntegrado.CAA.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
//@Tag(name = "usuario", description = "A API dos Usuarios")
public class UsuarioResouce {

	@Autowired
	private UsuarioRepository repositorio;

//	public UsuarioResouce(UsuarioService servico) {
//		this.servico = servico;
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Usuario> listaUsuario() {
		Iterable<Usuario> listaUsuario = repositorio.findAll();
		return listaUsuario;
	}

	@PostMapping()
	public Usuario saveUsuario(@RequestBody @Valid Usuario usuario) {
		return repositorio.save(usuario);
	}

	@PostMapping()
	public Usuario deleteUsuario(@RequestBody @Valid Usuario usuario) {
		repositorio.delete(usuario);
		return usuario;
	}
}
