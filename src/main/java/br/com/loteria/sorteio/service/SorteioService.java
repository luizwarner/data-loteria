package br.com.loteria.sorteio.service;

import br.com.loteria.sorteio.dto.SorteioDTORequest;
import br.com.loteria.sorteio.dto.SorteioDTOResponse;
import br.com.loteria.sorteio.model.SorteioEntity;

public interface SorteioService {

	public Iterable<SorteioEntity> findAll();
	
	SorteioDTOResponse save(SorteioDTORequest sorteioDTORequest);
	
}
