package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IPacienteServi;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private IPacienteServi pacienteServi;
	
	@GetMapping("/buscar/{idPaciente}")
	public String buscarPaciente(@PathVariable("idPaciente") Integer idPaciente, Model modelo) {
		Paciente paciente = this.pacienteServi.buscar(idPaciente);
		modelo.addAttribute("paci", paciente);
		return "paciente";
	}
}
