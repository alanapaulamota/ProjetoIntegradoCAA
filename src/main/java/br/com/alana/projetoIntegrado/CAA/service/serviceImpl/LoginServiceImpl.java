package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alana.projetoIntegrado.CAA.model.Login;
import br.com.alana.projetoIntegrado.CAA.repository.LoginRepository;
import br.com.alana.projetoIntegrado.CAA.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository repositorio;

	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Login findById(long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Login save(Login login) {
		return repositorio.save(login);
	}

}
