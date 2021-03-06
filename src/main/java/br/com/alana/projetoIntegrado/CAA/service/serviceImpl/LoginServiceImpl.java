package br.com.alana.projetoIntegrado.CAA.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alana.projetoIntegrado.CAA.model.Login;
import br.com.alana.projetoIntegrado.CAA.repository.LoginRepository;
import br.com.alana.projetoIntegrado.CAA.service.LoginService;

@Service //Define que minha classe sera um Service
public class LoginServiceImpl implements LoginService {

	// Ponto de injeção para conseguir usar as instãncias do repositório
	// LoginRepository
	@Autowired
	LoginRepository repositorio;

	// Metodos implementados da interface CadastroService
	@Override
	public List<Login> findAll() {
		return repositorio.findAll(); //busca todos Usuarios logados
	}

	@Override
	public Login findById(long id) {
		return repositorio.findById(id).get(); // .get() serve para o obter o CadastroUser Logado, e não um Optional
												// (repositorio) de CadastroUser Logado
	}

	@Override
	public Login save(Login login) { // metodo save ultilizando metodo save do jpa Repository e passar o usuario
										// logado que ta recebendo como parametro
		return repositorio.save(login);
	}

}
