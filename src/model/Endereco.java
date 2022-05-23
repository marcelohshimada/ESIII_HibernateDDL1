package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "endereco")
public class Endereco {
	@Id
	@Column(name = "pessoaId")
	@NotNull
	private int enderecoId;

	@Id
	@OneToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoaId")
	@NotNull
	private Pessoa pessoa;

	@Column(name = "logradouro", length = 100)
	@NotNull
	private String logradouro;

	@Column(name = "numero")
	@NotNull
	private int numero;

	@Column(name = "complemento", length = 100)
	private String complemento;

	public int getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(int enderecoId) {
		this.enderecoId = enderecoId;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [enderecoId=" + enderecoId + ", pessoa=" + pessoa + ", logradouro=" + logradouro + ", numero="
				+ numero + ", complemento=" + complemento + "]";
	}

}