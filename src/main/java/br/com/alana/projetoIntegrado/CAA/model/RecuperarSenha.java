package br.com.alana.projetoIntegrado.CAA.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "recuperarSenha")
public class RecuperarSenha implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGeneratorUsuario")
	@SequenceGenerator(name = "sequenceGeneratorUsuario", initialValue = 1, sequenceName = "seq_usuario")
	private Long id;

	@Column(name = "cpf", length = 11, nullable = false, unique = true) // Anotação que define uma coluna no banco de
																		// dados cujo o valor do atributo pode ter no
																		// maximo 11 caracteres, não pode ser nulo e é
																		// unico
	@NotBlank // Não pode ser nulo, inexistente ou branco
	private String cpf;

	@JsonIgnore
	@NotBlank
	@Column(length = 60)
	private String senha;

//	    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
	@Size(min = 5, max = 254)
	@Column(length = 254, unique = true, nullable = false)
	private String email;

	@Size(max = 20)
	@Column(name = "telefone", length = 20)
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, id, senha, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof RecuperarSenha)) {
			return false;
		}
		RecuperarSenha other = (RecuperarSenha) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(senha, other.senha) && Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {
		return String.format("RecuperarSenha [cpf=%s, senha=%s]", cpf, senha);
	}

}
