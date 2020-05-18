package br.com.alana.projetoIntegrado.CAA.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "dicionario")
public class DicionarioHelp implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	private String palavra;

	@Column
	private String significado;

//	public DicionarioHelp() {
//
//	}

	public DicionarioHelp(String palavra, String significado) {
		super();
		this.palavra = palavra;
		this.significado = significado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, palavra, significado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DicionarioHelp)) {
			return false;
		}
		DicionarioHelp other = (DicionarioHelp) obj;
		return Objects.equals(id, other.id) && Objects.equals(palavra, other.palavra)
				&& Objects.equals(significado, other.significado);
	}

	@Override
	public String toString() {
		return String.format("DicionarioHelp: [id=%s, palavra=%s \n, significado=%s]", id, palavra, significado);
	}
	// GERANDO GETTERS E SETTER COM LOMBOK

}
