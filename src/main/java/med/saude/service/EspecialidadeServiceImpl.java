package med.saude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import med.saude.dao.EspecialidadeDao;
import med.saude.domain.Especialidade;

@Service
@Transactional(readOnly = false)
public class EspecialidadeServiceImpl implements EspecialidadeService {

	@Autowired
	private EspecialidadeDao dao;
	
	@Override
	public void salvar(Especialidade especialidade) {
		dao.save(especialidade);

	}

	@Override
	public void editar(Especialidade especialidade) {
		dao.update(especialidade);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Especialidade buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Especialidade> buscarTodos() {
		return dao.findAll();
	}

}
