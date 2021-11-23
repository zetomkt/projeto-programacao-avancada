package med.saude.dao;

import org.springframework.stereotype.Repository;
import med.saude.domain.Medico;

@Repository
public class MedicoDaoImpl extends AbstractDao<Medico, Long> implements MedicoDao{

}
