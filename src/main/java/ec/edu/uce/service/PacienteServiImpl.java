package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiImpl implements IPacienteServi {

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscar(id);
	}

	@Override
	public void insertar(Paciente estudiante) {
		// TODO Auto-generated method stub
		this.pacienteRepo.insertar(estudiante);
	}

	@Override
	public void actualizar(Paciente estudiante) {
		// TODO Auto-generated method stub
		this.pacienteRepo.actualizar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepo.eliminar(id);
	}

}
