package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteServi {
	Paciente buscar(Integer id);
	void insertar(Paciente estudiante);
	void actualizar(Paciente estudiante);
	void eliminar(Integer id);
}
