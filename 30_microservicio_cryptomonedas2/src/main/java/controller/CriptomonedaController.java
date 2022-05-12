package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Criptomoneda;
import service.CriptomonedaService;
 

@RestController
public class CriptomonedaController {
	@Autowired
	CriptomonedaService criptomonedaService;
	@PostMapping(value="Alta",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaCriptomoneda(@RequestBody Criptomoneda criptomoneda) {
		criptomonedaService.altaCriptomoneda(criptomoneda);
	}
	 
	
	@GetMapping(value="Criptomonedas",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Criptomoneda> criptomonedas(){
		return criptomonedaService.recuperarCriptomonedas();
	}
	
	@GetMapping(value="Criptomoneda/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Criptomoneda> CriptomonedaNombre(@PathVariable("name") String name){
		return criptomonedaService.recuperarCriptomoneda(name);
	}
	@DeleteMapping(value="Eliminar/{idCripto}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Criptomoneda> eliminarLibro(@PathVariable("id") int idCripto){
		criptomonedaService.eliminarCriptomoneda(idCripto);
		return criptomonedaService.recuperarCriptomonedas();
	}
	@GetMapping(value="idCripto/{name}", produces=MediaType.TEXT_PLAIN_VALUE)
	public String identificadorCriptomoneda(@PathVariable ("name") String name) {
		return criptomonedaService.idCriptomonedaPorNombre(name)+"";//recordar q al concatenar una cadena vacia se convierte a texto
	}
}
