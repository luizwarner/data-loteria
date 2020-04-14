package br.com.loteria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loteria.model.SorteioEntity;
import br.com.loteria.repository.SorteioRepository;

@Service
public class SorteioServiceImpl implements SorteioService {
	
	@Autowired
	private SorteioRepository sorteioRepository;

	@Override
	public Iterable<SorteioEntity> findAll() {
		return sorteioRepository.findAll();
	}	
}