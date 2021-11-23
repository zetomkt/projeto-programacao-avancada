package med.saude.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@SuppressWarnings("serial")
@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento extends AbstractEntity<Long> {

	private String nome;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_consulta", nullable = true, columnDefinition = "DATE")
	private LocalDate dataConsulta;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id_fk")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "especialidade_id")
	private Especialidade especialidades;
			
	@ManyToOne
	@JoinColumn(name = "medicos_id")
	private Medico medicos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Especialidade getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade especialidades) {
		this.especialidades = especialidades;
	}

	public Medico getMedicos() {
		return medicos;
	}

	public void setMedicos(Medico medicos) {
		this.medicos = medicos;
	}

}
