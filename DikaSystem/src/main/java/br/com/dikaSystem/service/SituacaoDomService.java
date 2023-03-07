package br.com.dikaSystem.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dikaSystem.model.SituacaoDom;
import br.com.dikaSystem.repository.SituacaoDomRepository;

@Service
@Transactional
public class SituacaoDomService {
	@Autowired
	private SituacaoDomRepository asRepository;
	
	public List<SituacaoDom> todos() {
		return asRepository.findAll();
	}

	public void save(SituacaoDom situacaoDom) {
		
		if (situacaoDom.isCasaAA() == true ) {
			situacaoDom.setCasaAAS("Sim"); 	
		} else {
			situacaoDom.setCasaAAS("Não"); 
		}
		
		if(situacaoDom.isCasaBB() == true) {
			situacaoDom.setCasaBBS("Sim");
		} else {
			situacaoDom.setCasaBBS("Não");
		}
		
		if(situacaoDom.isCasaCC() == true) {
			situacaoDom.setCasaCCS("Sim");
		} else { 
			situacaoDom.setCasaCCS("Não");
		}
		
		if(situacaoDom.isBcp() == true) {
			situacaoDom.setBcpS("Sim");
		} else {
			situacaoDom.setBcpS("Não");
		}
		
		if(situacaoDom.isAposentadoria() == true) {
			situacaoDom.setAposentadoriaS("Sim");
		} else {
			situacaoDom.setAposentadoriaS("Não");
		}
		
		if(situacaoDom.isAuxDoenca() == true) {
			situacaoDom.setAuxDoencaS("sim");
		} else {
			situacaoDom.setAuxDoencaS("Não");
		}
		
		if(situacaoDom.isPensao() == true) {
			situacaoDom.setPensaoS("sim");
		} else {
			situacaoDom.setPensaoS("Não");
		}
		
		asRepository.save(situacaoDom);
	}

	public void excluirSituacaoDom(Long id) {
		asRepository.deleteById(id);
	}
	
	public SituacaoDom buscarSituacaoDom(Long id) {
		return asRepository.findById(id).get();
	}
}
