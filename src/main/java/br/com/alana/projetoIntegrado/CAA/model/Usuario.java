package br.com.alana.projetoIntegrado.CAA.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Criando classe model com os respectivos atributos(nome,cpf,idade,email)
@Entity // Anotação que indica que a classe é uma entidade do banco de dados
@Table(name = "usuario") // Anotação indica nome da tabela a ser criada no banco de dados
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id // Anotação para indicar que o campo id é identificados da entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Anotação indica que o valor do id será gerado pelo banco de
														// dados
	@Column // Anotação que define uma coluna no banco de dados
	private Long id;

	@Column(name = "nome", length = 255, nullable = false) // Anotação que define uma coluna no banco de dados cujo o
															// valor do atributo pode ter no maximo 255 caracteres, e
															// não
															// pode ser nulo
	@Size(max = 255)
	@NotBlank // Não pode ser nulo, inexistente ou branco
	private String nome;

	@Column(name = "cpf", length = 11, nullable = false, unique = true) // Anotação que define uma coluna no banco de
																		// dados cujo o valor do atributo pode ter no
																		// maximo 11 caracteres, não pode ser nulo e é
																		// unico

	@NotBlank // Não pode ser nulo, inexistente ou branco
	private String cpf;

	@NotNull // Não pode ser nulo
	private Integer idade;

	@NotBlank // Não pode ser nulo, inexistente ou branco
	@Column(length = 60, nullable = false) // Anotação que define uma coluna no banco de dados cujo o valor do atributo
	// pode ter no maximo 60 caracteres
	private String senha;

//Gerando getters and setters 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// Gerando HashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, idade, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(idade, other.idade)
				&& Objects.equals(senha, other.senha) && Objects.equals(nome, other.nome);
	}

	// Gerando toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + "]";
	}

}
