package med.saude.dao;

import java.util.List;
import med.saude.domain.Agendamento;

public interface AgendamentoDao {

	void save(Agendamento agendamento);

	void update(Agendamento agendamento);

	void delete(Long id);

	Agendamento findById(Long id);

	List<Agendamento> findAll();
}
