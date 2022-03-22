package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	Paciente buscar(Integer id);
	void insertar(Paciente estudiante);
	void actualizar(Paciente estudiante);
	void eliminar(Integer id);
}
