package com.elp.ReservadeCitasMedicas20.Service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadResponse;
import com.elp.ReservadeCitasMedicas20.Model.Especialidad;
import com.elp.ReservadeCitasMedicas20.Repository.EspecialidadRepository;
import com.elp.ReservadeCitasMedicas20.Service.EspecialidadService;
import com.elp.ReservadeCitasMedicas20.Service.mapper.EspecialidadMapper;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{
	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	@Autowired
	private EspecialidadMapper especialidadMapper;
	
	@Override
	public Collection<EspecialidadResponse> findAllEspecialidad() {
		Collection<Especialidad>  listEspecialidadResponses = especialidadRepository.findAll();
		return especialidadMapper.toListEspecialidadToEspecialidadResponse(listEspecialidadResponses);
	}
	@Override
	public EspecialidadResponse findByIdEspecialidad(Long idEspecialidad) {
		Especialidad especialidad = especialidadRepository.findById(idEspecialidad).orElse(null);
		return especialidadMapper.toEspecialidadToEspecialidadResponse(especialidad);
	}
	@Override
	public void saveEspecialidad(EspecialidadRequest request) {
		Especialidad especiaidadNew =new Especialidad();
		especiaidadNew.setNombre_especialidad(request.getNombre_especialidad());
		especiaidadNew.setMedico(request.getMedico());
		especialidadRepository.save(especiaidadNew);
	}
	@Override
	public void updateEspecialidad(Long Id, EspecialidadRequest request) {
		Especialidad especialidad = especialidadRepository.findById(Id).orElse(null);
		if (especialidad != null) {
			especialidad.setNombre_especialidad(request.getNombre_especialidad());
			especialidad.setMedico(request.getMedico());
			especialidadRepository.save(especialidad);
		}
		
	}
	@Override
	public void deleteEspecialidad(Long idEspecialidad) {
		Especialidad especialidad = especialidadRepository.findById(idEspecialidad).orElse(null);
		if (especialidad != null) {
			especialidadRepository.delete(especialidad);
		}
		
	}
	
	
}
