package med.saude.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import med.saude.domain.Agendamento;
import med.saude.service.AgendamentoService;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoService agendamentoService;

	@GetMapping("/cadastrar")
	public String cadastrar(Agendamento agendamento) {
		return "/agendamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("agendamentos", agendamentoService.buscarTodos());
		return "/agendamento/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Agendamento agendamento) {
		agendamentoService.salvar(agendamento);
		return "redirect:/agendamentos/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("agendamento", agendamentoService.buscarPorId(id));
		return "/agendamento/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Agendamento agendamento) {
		agendamentoService.editar(agendamento);
		return "redirect:/agendamentos/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		agendamentoService.excluir(id);
		return listar(model);
		 
	}
}