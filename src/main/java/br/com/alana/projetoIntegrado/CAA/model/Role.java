package br.com.alana.projetoIntegrado.CAA.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	@Id
	private String nomeRole;

	@ManyToMany
	private List<CadastroUser> user;

	@Override
	public String getAuthority() {
		return this.nomeRole;
	}

}
