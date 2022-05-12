package service;

import java.util.Date;
import java.util.List;

import model.Criptomoneda;
 

public interface CriptomonedaService {

	List<Criptomoneda> recuperarCriptomonedas();

	List<Criptomoneda> recuperarCriptomoneda(String name);

	void altaCriptomoneda(Criptomoneda Criptomoneda);
  
	void eliminarCriptomoneda(int idCriptomoneda);

	int idCriptomonedaPorNombre(String name);
 
	
}