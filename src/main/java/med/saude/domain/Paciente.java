package med.saude.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "PACIENTE")
public class Paciente extends AbstractEntity<Long> {
	@Column(nullable = false, unique = false)
	private String nome;
	@Column(nullable = false, unique = false)
	private String sobreNome;
	@Column(nullable = false, length = 14)
	private String cpf;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_nascimento", nullable = true, columnDefinition = "DATE")
	private LocalDate dataNascimento;

//	@OneToMany(mappedBy = "paciente")
//	private List<Agendamento> agendamentos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
