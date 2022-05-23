package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendente")
public class Medico {
	@Column(name = "codigo")
	@NotNull
	private int codigo;

	@Column(name = "contato", length = 30)
	@NotNull
	private String contato;

	@Column(name = "especialidade", length = 50)
	@NotNull
	private String especialidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", contato=" + contato + ", especialidade=" + especialidade + "]";
	}

}