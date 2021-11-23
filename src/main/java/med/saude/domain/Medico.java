package med.saude.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "MEDICO")
public class Medico extends AbstractEntity<Long> {
	private String nome;
	private Integer crm;

	@ManyToOne
	@JoinColumn(name = "especialidade_id")
	private Especialidade especialidade;
	
	@ManyToMany
	@JoinColumn(name = "agendamento_id")
	 private List<Agendamento> agendamentos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}


}
