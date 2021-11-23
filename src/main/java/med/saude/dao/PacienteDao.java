package med.saude.dao;

import java.util.List;
import med.saude.domain.Paciente;

public interface PacienteDao {

	void save(Paciente paciente);

	void update(Paciente paciente);

	void delete(Long id);

	Paciente findById(Long id);

	List<Paciente> findAll();

}