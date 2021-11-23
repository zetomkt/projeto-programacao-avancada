package med.saude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import med.saude.dao.MedicoDao;
import med.saude.domain.Medico;

@Service
@Transactional(readOnly = false)
public class MedicoServiceImpl implements MedicoService{

	@Autowired
	private MedicoDao dao;
	
	@Override
	public void salvar(Medico medico) {
		dao.save(medico);
		
	}

	@Override
	public void editar(Medico medico) {
		dao.update(medico);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Medico buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Medico> buscarTodos() {
		return dao.findAll();
	}

}
