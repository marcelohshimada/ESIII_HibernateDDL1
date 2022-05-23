package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import net.sourceforge.jtds.jdbc.DateTime;

@Entity
@Table(name = "consulta")
public class Consulta {
	@Id
	@ManyToOne(targetEntity = Paciente.class)
	@NotNull
	private Paciente paciente;

	@Id
	@ManyToOne(targetEntity = Medico.class)
	@NotNull
	private Medico medico;

	@Column(name = "data")
	private DateTime data;
}