package br.com.alana.projetoIntegrado.CAA.service;

import java.util.List;

import br.com.alana.projetoIntegrado.CAA.model.Login;

public interface LoginService {

	List<Login> findAll();

	Login findById(long id);

	Login save(Login login);

}
