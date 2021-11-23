package med.saude.service;

import java.util.List;
import med.saude.domain.Agendamento;

public interface AgendamentoService {
	void salvar(Agendamento agendamento);

	void editar(Agendamento agendamento);

	void excluir(Long id);

	Agendamento buscarPorId(Long id);

	List<Agendamento> buscarTodos();
}
