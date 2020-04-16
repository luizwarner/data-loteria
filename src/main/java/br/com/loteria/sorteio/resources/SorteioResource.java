package br.com.loteria.sorteio.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loteria.sorteio.dto.SorteioDTORequest;
import br.com.loteria.sorteio.model.SorteioEntity;
import br.com.loteria.sorteio.service.SorteioService;
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
	
	@PostMapping
	@ApiOperation(value = "Salva sorteio")
	public ResponseEntity<?> save(@RequestBody SorteioDTORequest sorteioDTORequest){
		return new ResponseEntity<>(sorteioService.save(sorteioDTORequest), HttpStatus.OK);
	}
	
}
