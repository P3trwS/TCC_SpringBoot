package br.com.dikaSystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.dikaSystem.model.SituacaoDom;
import br.com.dikaSystem.service.SituacaoDomService;

@Controller
@RequestMapping("/situacaoDom")
public class SituacaoDomController {
	@Autowired
	private SituacaoDomService asService;
	
	@RequestMapping("novo")
	public ModelAndView add(SituacaoDom situacaoDom) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("CadastroSituacaoDom"); //falta o html pra deixar sem o NULL...
		mv.addObject("situacaoDom", situacaoDom);
		return mv;
	}
	
	@RequestMapping("listar")
	public String ListaSituacaoDom(Model model) {
		List<SituacaoDom> listaSituacaoDom = asService.todos();
		model.addAttribute("listaSituacaoDom", listaSituacaoDom);
		return "situacaoDom";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView salvar(@Valid @ModelAttribute("situacaoDom") SituacaoDom situacaoDom, BindingResult result) {
		
		if(result.hasErrors()){
			return add(situacaoDom);
		}
		asService.save(situacaoDom);
		ModelAndView mv = new ModelAndView("redirect:/situacaoDom/listar");// deixar no novo até fazer o listar
		return mv;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		asService.excluirSituacaoDom(id);
		ModelAndView mv = new ModelAndView("redirect:/situacaoDom/listar");// deixar no novo até fazer o listar
		return mv;
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		return add(asService.buscarSituacaoDom(id));
	}
}
