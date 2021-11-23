package med.saude.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESPECIALIDADE")
public class Especialidade extends AbstractEntity<Long> {

	private String titulo;
	private String descricao;

//	@OneToMany(mappedBy = "especialidade")
//	private List<Medico> medicos;
	
//	@OneToMany
//	@JoinColumn(name = "agendamento")
//	private List<Agendamento> agendamentos;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

//	public List<Medico> getMedicos() {
//		return medicos;
//	}
//
//	public void setMedicos(List<Medico> medicos) {
//		this.medicos = medicos;
//	}


}
