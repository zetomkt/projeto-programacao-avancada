package med.saude.dao;

import java.util.List;
import med.saude.domain.Especialidade;

public interface EspecialidadeDao {

	void save(Especialidade especialidade);

	void update(Especialidade especialidade);

	void delete(Long id);

	Especialidade findById(Long id);

	List<Especialidade> findAll();
}