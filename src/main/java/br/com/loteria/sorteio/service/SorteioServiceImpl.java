package br.com.loteria.sorteio.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loteria.sorteio.dto.SorteioDTORequest;
import br.com.loteria.sorteio.dto.SorteioDTOResponse;
import br.com.loteria.sorteio.model.SorteioEntity;
import br.com.loteria.sorteio.repository.SorteioRepository;

@Service
public class SorteioServiceImpl implements SorteioService {
	
	@Autowired
	private SorteioRepository sorteioRepository;

	@Override
	public Iterable<SorteioEntity> findAll() {
		return sorteioRepository.findAll();
	}
	
	@Override
	public SorteioDTOResponse save(SorteioDTORequest sorteioDTORequest) {
		
		SorteioEntity sorteioEntity = DTOParaEntity(sorteioDTORequest);
		sorteioRepository.save(sorteioEntity);
		return null;
	}
	
	private SorteioEntity DTOParaEntity(SorteioDTORequest sorteioDTORequest) {
		ModelMapper modelMapper = new ModelMapper();
		SorteioEntity sorteioEntity = modelMapper.map(sorteioDTORequest, SorteioEntity.class);
		return sorteioEntity;
	}
	
	private SorteioDTOResponse entityParaDTO(SorteioEntity sorteioEntity) {
		ModelMapper modelMapper = new ModelMapper();
		SorteioDTOResponse sorteioDTOResponse = modelMapper.map(sorteioEntity, SorteioDTOResponse.class);
		return sorteioDTOResponse;
	}
	
}