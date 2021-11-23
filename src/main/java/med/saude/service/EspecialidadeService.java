package med.saude.service;

import java.util.List;
import med.saude.domain.Especialidade;

public interface EspecialidadeService {
	
	void salvar(Especialidade especialidade);

	void editar(Especialidade especialidade);

	void excluir(Long id);

	Especialidade buscarPorId(Long id);

	List<Especialidade> buscarTodos();
}
