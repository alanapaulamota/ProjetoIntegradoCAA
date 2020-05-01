//package br.com.alana.projetoIntegrado.CAA.dto;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.validation.constraints.NotBlank;
//
//import org.springframework.data.annotation.Id;
//
//import br.com.alana.projetoIntegrado.CAA.domain.Usuario;
//
//public class UsuarioDTO {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//
//	@NotBlank
//	private String nome;
//
//	@NotBlank
//	private String cpf;
//
//	@NotBlank
//	private String idade;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getCpf() {
//		return cpf;
//	}
//
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
//
//	public String getIdade() {
//		return idade;
//	}
//
//	public void setIdade(String idade) {
//		this.idade = idade;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		if (id == null) {
//			if (other.getId() != null)
//				return false;
//		} else if (!id.equals(other.getId()))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		final StringBuilder sb = new StringBuilder("Usuario{");
//		sb.append("id=").append(id);
//		sb.append(", nome='").append(nome).append('\'');
//		sb.append(", cpf='").append(cpf).append('\'');
//		sb.append(", idade='").append(idade).append('\'');
//		sb.append('}');
//		return sb.toString();
//	}
//
//}
