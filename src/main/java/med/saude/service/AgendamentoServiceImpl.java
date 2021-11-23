package med.saude.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import med.saude.dao.AgendamentoDao;
import med.saude.domain.Agendamento;

@Service
@Transactional(readOnly = false)
public class AgendamentoServiceImpl implements AgendamentoService {

	@Autowired
	private AgendamentoDao dao;

	@Override
	public void salvar(Agendamento agendamento) {
		dao.save(agendamento);

	}

	@Override
	public void editar(Agendamento agendamento) {
		dao.update(agendamento);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Agendamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Agendamento> buscarTodos() {
		return dao.findAll();
	}

}
