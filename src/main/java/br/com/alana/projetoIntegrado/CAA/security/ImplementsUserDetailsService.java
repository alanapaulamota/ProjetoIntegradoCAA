package br.com.alana.projetoIntegrado.CAA.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.alana.projetoIntegrado.CAA.model.CadastroUser;
import br.com.alana.projetoIntegrado.CAA.repository.CadastroRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

	@Autowired
	private CadastroRepository cadRep;

	@Override
	public UserDetails loadUserByUsername(String cpf) throws UsernameNotFoundException {
		Optional<CadastroUser> user = cadRep.findByCpf(cpf);

		if (user == null) {
			throw new UsernameNotFoundException("CPF nao encontrado!");
		}

		return user.get();
	}

}
