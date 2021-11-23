package med.saude.service;

import java.util.List;
import med.saude.domain.Medico;

public interface MedicoService {
	void salvar(Medico medico);

	void editar(Medico medico);

	void excluir(Long id);

	Medico buscarPorId(Long id);

	List<Medico> buscarTodos();
}
