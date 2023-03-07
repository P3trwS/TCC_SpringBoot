package br.com.dikaSystem.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dikaSystem.model.CompFamiliar;
import br.com.dikaSystem.repository.CompFamiliarRepository;

@Service
@Transactional
public class CompFamiliarService {
	
	@Autowired
	private CompFamiliarRepository asRepository;
	
	public List<CompFamiliar> todos() {
		return asRepository.findAll();
	}

	public void save(CompFamiliar compFamiliar) {
		asRepository.save(compFamiliar);
	}

	public void excluirCompFamliar(Long id) {
		asRepository.deleteById(id);
	}
	
	public CompFamiliar buscarCompFamiliar(Long id) {
		return asRepository.findById(id).get();
	}
}
