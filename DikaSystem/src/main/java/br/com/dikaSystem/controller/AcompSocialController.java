package br.com.dikaSystem.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import br.com.dikaSystem.model.AcompSocial;
import br.com.dikaSystem.service.AcompSocialService;

@Controller
@RequestMapping("/acompSocial")
public class AcompSocialController {

	@Autowired
	private AcompSocialService asService;

	@RequestMapping("novo")
	public ModelAndView add(AcompSocial acompSocial) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CadastroAcompSocial"); // falta o html para deixar sem o NULL...
		mv.addObject("acompSocial", acompSocial);
		return mv;
	}

	@RequestMapping("listar")
	public String ListaAcompSocial(Model model) {
		List<AcompSocial> listaAcompSocial = asService.todos();
		model.addAttribute("listaAcompSocial", listaAcompSocial);
		return "acompSocial";
	}

	@RequestMapping("save")
	public String salvar(AcompSocial acompSocial) {
		asService.save(acompSocial);
		return "redirect:/acompSocial/listar";// deixar no novo até fazer o listar
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		asService.excluirAcompSocial(id);
		ModelAndView mv = new ModelAndView("redirect:/acompSocial/listar"); // deixar no novo até fazer o listar
		return mv;
	}

	@RequestMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		return add(asService.buscarAcompSocial(id));
	}

	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// convert the date Note that the conversion here should always be in the same
		// format as the string passed in, e.g. 2015-9-9 should be yyyy-MM-dd
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor is a custom
																						// date editor
	}
}
