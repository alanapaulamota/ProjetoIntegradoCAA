package br.com.alana.projetoIntegrado.CAA.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "faleConosco")
public class HelpFaleConosco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@NotBlank
	@Lob
	private String texto;

	@Override
	public int hashCode() {
		return Objects.hash(id, texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HelpFaleConosco)) {
			return false;
		}
		HelpFaleConosco other = (HelpFaleConosco) obj;
		return Objects.equals(id, other.id) && Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return String.format("HelpFaleConosco [id=%s, texto=%s]", id, texto);
	}

}
