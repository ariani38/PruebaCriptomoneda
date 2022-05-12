package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Criptomoneda;
 
 
 

public interface CriptomonedaDao extends JpaRepository<Criptomoneda,Integer>{
	@Query("select c from Criptomoneda c where c.name=?1")
	List<Criptomoneda> findByName(String name);
	
	Criptomoneda findCriptoByName(String name);
}
