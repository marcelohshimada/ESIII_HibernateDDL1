package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa")
public abstract class Pessoa {
	@Id
	@Column(name = "pessoaId")
	@NotNull
	private int pessoaId;

	@Column(name = "nome", length = 100)
	@NotNull
	private String nome;

	public int getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(int pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [pessoaId=" + pessoaId + ", nome=" + nome + "]";
	}

}