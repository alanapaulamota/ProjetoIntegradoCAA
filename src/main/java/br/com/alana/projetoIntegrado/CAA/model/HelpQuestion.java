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
@Table(name = "perguntasFresquentes")
public class HelpQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	private String pergunta;

	@Column
	private String resposta;

//	public HelpQuestion() {
//	}

	public HelpQuestion(String pergunta, String resposta) {
		super();
		this.pergunta = pergunta;
		this.resposta = resposta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
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

}
