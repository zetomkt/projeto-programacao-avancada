package med.saude.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import med.saude.domain.Especialidade;
import med.saude.service.EspecialidadeService;



@Controller
@RequestMapping("/especialidades")
public class EspecialidadeController {
	
	@Autowired
	private EspecialidadeService especialidadeService;

	@GetMapping("/cadastrar")
	public String cadastrar(Especialidade especialidade) {
		return "/especialidade/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("especialidades", especialidadeService.buscarTodos());
		return "/especialidade/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Especialidade especialidade) {
		especialidadeService.salvar(especialidade);
		return "redirect:/especialidades/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("especialidade", especialidadeService.buscarPorId(id));
		return "/especialidade/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Especialidade especialidade) {
		especialidadeService.editar(especialidade);
		return "redirect:/especialidades/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		especialidadeService.excluir(id);
		return listar(model);
		 
	}
	
}