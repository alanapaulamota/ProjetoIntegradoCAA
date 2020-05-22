package br.com.alana.projetoIntegrado.CAA.model;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Criando classe model com os respectivos atributos(nome,cpf,idade,email)
@Entity // Anotação que indica que a classe é uma entidade do banco de dados
@Table(name = "cadastroUser") // Anotação indica nome da tabela a ser criada no banco de dados
public class CadastroUser implements UserDetails {
	private static final long serialVersionUID = 1L;

	@Id // Anotação para indicar que o campo id é identificados da entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Anotação indica que o valor do id será gerado pelo banco de
														// dados
	@Column // Anotação que define uma coluna no banco de dados
	private Long id;

	@Column(name = "nome", length = 255, nullable = false) // Anotação que define uma coluna no banco de dados cujo o
															// valor do atributo pode ter no maximo 255 caracteres, e
															// não pode ser nulo
	@Size(max = 255)
	@NotBlank(message = " não pode estar em branco") // Não pode ser nulo, inexistente ou branco
	private String nome;

	@Column(name = "cpf", length = 20, nullable = false, unique = true) // Anotação que define uma coluna no banco de
																		// dados cujo o valor do atributo pode ter no
																		// maximo 20 caracteres, não pode ser nulo e é
																		// unico
	@NotBlank(message = " não pode estar em branco") // Não pode ser nulo, inexistente ou branco
	private String cpf;

	@NotNull // Não pode ser nulo
	private Integer idade;

	@NotBlank(message = " não pode estar em branco") // Não pode ser nulo, inexistente ou branco
	@Column(length = 60, nullable = false) // Anotação que define uma coluna no banco de dados cujo o valor do atributo
	// pode ter no maximo 60 caracteres
	private String senha;

	@Size(min = 5, max = 254)
	@Column(length = 254, unique = true, nullable = false)
	private String email;

	@ManyToMany
	private List<Role>roles;
//	@JoinTable(name="usuariosRoles", joinColumns = @JoinColumn (name="usuarioRoleId", referencedColumnName = "cpf"), inverseJoinColumns = @JoinColumn(name ="")  )
	
	
	// Gerando HashCode and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CadastroUser)) {
			return false;
		}
		CadastroUser other = (CadastroUser) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, id, idade, nome, senha);
	}

	// Gerando toString
	@Override
	public String toString() {
		return "CadastroUsuario [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.cpf;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	// CRIANDO GETTERS E SETTER COM LOMBOK
	
}
