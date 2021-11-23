package med.saude.dao;

import org.springframework.stereotype.Repository;

import med.saude.domain.Paciente;

@Repository
public class PacienteDaoImpl extends AbstractDao<Paciente, Long> implements PacienteDao {

}