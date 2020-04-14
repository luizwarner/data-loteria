package br.com.loteria.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loteria.model.SorteioEntity;
import br.com.loteria.service.SorteioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/sorteio")
@Api(value = "CRUD para Sorteio")
public class SorteioResource {

	private SorteioService sorteioService;

	@Autowired
	public SorteioResource(SorteioService sorteioService) {
		this.sorteioService = sorteioService;
	}

	@GetMapping
	@ApiOperation(value = "Retorna todos os sorteios")
	public Iterable<SorteioEntity> getAll(){
		
		return sorteioService.findAll();
		//return ResponseEntity.ok().body("teste!!!!!!!!");
	}
	
	@PutMapping
	@ApiOperation(value = "Insere sorteio")
	public ResponseEntity inserir(){
		return null;
	}
	
}
