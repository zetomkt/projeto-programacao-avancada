package med.saude.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import med.saude.dao.PacienteDao;
import med.saude.domain.Paciente;

@Service
@Transactional(readOnly = false)
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteDao dao;
	
	@Override
	public void salvar(Paciente paciente) {
		dao.save(paciente);
	}

	@Override
	public void editar(Paciente paciente) {
		dao.update(paciente);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Paciente buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Paciente> buscarTodos() {
		return dao.findAll();
	}
}