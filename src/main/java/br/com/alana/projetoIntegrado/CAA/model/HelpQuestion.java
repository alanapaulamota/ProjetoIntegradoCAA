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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "perguntasFresquentes")
public class HelpQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	@NotBlank
	private String pergunta;

	@Column
	@NotBlank
	private String resposta;

//	public HelpQuestion() {
//	}

	public HelpQuestion(String pergunta, String resposta) {
		super();
		this.pergunta = pergunta;
		this.resposta = resposta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, pergunta, resposta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HelpQuestion)) {
			return false;
		}
		HelpQuestion other = (HelpQuestion) obj;
		return Objects.equals(id, other.id) && Objects.equals(pergunta, other.pergunta)
				&& Objects.equals(resposta, other.resposta);
	}

	@Override
	public String toString() {
		return String.format("HelpQuestion [id=%s, pergunta=%s, resposta=%s]", id, pergunta, resposta);
	}

	// GERANDO GETTERS E SETTER COM LOMBOK
}
