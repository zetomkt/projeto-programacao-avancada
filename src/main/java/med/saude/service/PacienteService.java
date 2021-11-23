package med.saude.service;

import java.util.List;

import med.saude.domain.Paciente;

public interface PacienteService {
	
	void salvar(Paciente paciente);

	void editar(Paciente paciente);

	void excluir(Long id);

	Paciente buscarPorId(Long id);

	List<Paciente> buscarTodos();

}
