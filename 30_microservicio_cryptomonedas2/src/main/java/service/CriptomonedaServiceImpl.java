package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CriptomonedaDao;
 
import model.Criptomoneda;
 

@Service
public class CriptomonedaServiceImpl implements CriptomonedaService {
	
	@Autowired
	CriptomonedaDao  criptomonedaDao;
	
	 
	@Override
	public List<Criptomoneda> recuperarCriptomonedas() {
		return criptomonedaDao.findAll();
	}

	@Override
	public List<Criptomoneda> recuperarCriptomoneda(String name) {
		return  criptomonedaDao.findByName(name);
	}

	@Override
	public void altaCriptomoneda( Criptomoneda criptomoneda) {
		criptomonedaDao.save(criptomoneda);
		
	}

	 

	@Override
	public void eliminarCriptomoneda(int idCriptomoneda) {
		criptomonedaDao.deleteById(idCriptomoneda);
		
	}

	@Override
	public int idCriptomonedaPorNombre(String name) {
		return criptomonedaDao.findCriptoByName(name).getIdCripto();
	}
	
	
	
}
