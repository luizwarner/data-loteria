package br.com.loteria.service;

import br.com.loteria.model.SorteioEntity;

public interface SorteioService {

	public Iterable<SorteioEntity> findAll();
	
}
