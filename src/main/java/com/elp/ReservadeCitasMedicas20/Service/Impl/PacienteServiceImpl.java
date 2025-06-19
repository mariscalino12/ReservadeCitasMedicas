package com.elp.ReservadeCitasMedicas20.Service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteResponse;
import com.elp.ReservadeCitasMedicas20.Model.Paciente;
import com.elp.ReservadeCitasMedicas20.Repository.PacienteRepository;
import com.elp.ReservadeCitasMedicas20.Service.PacienteService;
import com.elp.ReservadeCitasMedicas20.Service.mapper.PacienteMapper;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	@Autowired
	private PacienteMapper pacienteMapper;
	@Override
	public Collection<PacienteResponse> findAllPaciente() {
		Collection<Paciente> listPacienteResponses= pacienteRepository.findAll();
		return pacienteMapper.toListPacienteToPacienteResponse(listPacienteResponses);
	}
	@Override
	public PacienteResponse findByIdPaciente(Long idPaciente) {
		Paciente paciente = pacienteRepository.findById(idPaciente).orElse(null);
		return pacienteMapper.toPacienteTopacienteResponse(paciente);
	}
	@Override
	public void savePaciente(PacienteRequest request) {
		Paciente pacienteNew = new Paciente();
		pacienteNew.setDni(request.getDni());
		pacienteNew.setNombre(request.getNombre());
		pacienteNew.setApellido_paterno(request.getApellido_paterno());
		pacienteNew.setApellido_materno(request.getApellido_materno());
		pacienteNew.setFecha_nacimiento(request.getFecha_nacimiento());
		pacienteNew.setGenero(request.getGenero());
		pacienteNew.setDireccion(request.getDireccion());
		pacienteNew.setTelefono(request.getTelefono());
		pacienteNew.setEstado_asegurado(request.getEstado_asegurado());
		pacienteRepository.save(pacienteNew);
	}
	@Override
	public void updatePaciente(Long Id, PacienteRequest request) {
		Paciente paciente = pacienteRepository.findById(Id).orElse(null);
		
		if (paciente != null) {
			paciente.setDni(request.getDni());
			paciente.setNombre(request.getNombre());
			paciente.setApellido_paterno(request.getApellido_paterno());
			paciente.setApellido_materno(request.getApellido_materno());
			paciente.setFecha_nacimiento(request.getFecha_nacimiento());
			paciente.setGenero(request.getGenero());
			paciente.setDireccion(request.getDireccion());
			paciente.setTelefono(request.getTelefono());
			paciente.setEstado_asegurado(request.getEstado_asegurado());
			pacienteRepository.save(paciente);
		}
		
	}
	@Override
	public void deletePaciente(Long idPaciente) {
		Paciente paciente = pacienteRepository.findById(idPaciente).orElse(null);
		
		if (paciente != null) {
			pacienteRepository.delete(paciente);
		}
	}
	
}
