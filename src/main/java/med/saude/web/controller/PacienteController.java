package med.saude.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import med.saude.domain.Paciente;
import med.saude.service.PacienteService;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;

	@GetMapping("/cadastrar")
	public String cadastrar(Paciente paciente) {
		return "/paciente/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pacientes", pacienteService.buscarTodos());
		return "/paciente/lista";
	}

	@PostMapping("/salvar")
	public String salvar(Paciente paciente) {
		pacienteService.salvar(paciente);
		return "redirect:/pacientes/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("paciente", pacienteService.buscarPorId(id));
		return "/paciente/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Paciente paciente) {
		pacienteService.editar(paciente);
		return "redirect:/pacientes/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		pacienteService.excluir(id);
		return listar(model);
		 
	}
	
}



