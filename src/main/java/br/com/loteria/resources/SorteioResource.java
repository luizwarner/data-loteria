package br.com.loteria.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loteria.model.SorteioEntity;
import br.com.loteria.service.SorteioService;

@RestController
@RequestMapping("/api/v1/sorteio")
public class SorteioResource {

	private SorteioService sorteioService;

	@Autowired
	public SorteioResource(SorteioService sorteioService) {
		this.sorteioService = sorteioService;
	}

	@GetMapping
	public Iterable<SorteioEntity> getAll(){
		
		return sorteioService.findAll();
		//return ResponseEntity.ok().body("teste!!!!!!!!");
	}
	
	@PutMapping
	public ResponseEntity inserir(){
		return null;
	}
	
}
