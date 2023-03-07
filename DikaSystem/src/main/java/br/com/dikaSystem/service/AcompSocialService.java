package br.com.dikaSystem.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dikaSystem.model.AcompSocial;
import br.com.dikaSystem.repository.AcompSocialRepository;

@Service
@Transactional
public class AcompSocialService {

	@Autowired
	private AcompSocialRepository asRepository;
	
	public List<AcompSocial> todos() {
		return asRepository.findAll();
	}

	public void save(AcompSocial acompSocial) {
		
		if (acompSocial.getAuxGov() == true) {
			acompSocial.setAuxGovS("Sim");
			
		} else { 
			acompSocial.setAuxGovS("Não");
		}
		
		asRepository.save(acompSocial);
	}

	public void excluirAcompSocial(Long id) {
		asRepository.deleteById(id);
	}
	
	public AcompSocial buscarAcompSocial(Long id) {
		return asRepository.findById(id).get();
	}
}
