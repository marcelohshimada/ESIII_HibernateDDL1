package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "paciente")
public class Paciente extends Pessoa {
	@Column(name = "numeroBeneficiario")
	@NotNull
	private int numBeneficiario;

	@Column(name = "telefone", length = 11)
	private String telefone;

	public int getNumBeneficiario() {
		return numBeneficiario;
	}

	public void setNumBeneficiario(int numBeneficiario) {
		this.numBeneficiario = numBeneficiario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Paciente [numBeneficiario=" + numBeneficiario + ", telefone=" + telefone + "]";
	}

}