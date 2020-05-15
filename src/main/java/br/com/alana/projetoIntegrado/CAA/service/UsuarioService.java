package br.com.alana.projetoIntegrado.CAA.service;

import java.util.List;

import br.com.alana.projetoIntegrado.CAA.model.Usuario;


/* A interface Service
*
* 
*/

public interface UsuarioService {

	// metodo que retona uma lista de Usuarios cadastrados
	List<Usuario> findAll();

	// metodo que retorna um unico Usuario cadastrado, buscando pelo parametro id do
	// tipo de dado long
	Usuario findById(long id);

	// metodo save recebe um usuario cadastrado e salva no banco de dados
	Usuario save(Usuario usuario);

}
