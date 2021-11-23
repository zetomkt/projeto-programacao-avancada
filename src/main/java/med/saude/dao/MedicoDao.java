package med.saude.dao;

import java.util.List;
import med.saude.domain.Medico;

public interface MedicoDao {

	void save(Medico medico);

	void update(Medico medico);

	void delete(Long id);

	Medico findById(Long id);

	List<Medico> findAll();
	
}
