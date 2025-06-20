package com.elp.ReservadeCitasMedicas20.Service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaResponse;
import com.elp.ReservadeCitasMedicas20.Model.Cita;
import com.elp.ReservadeCitasMedicas20.Repository.CitaRepository;
import com.elp.ReservadeCitasMedicas20.Service.CItaService;
import com.elp.ReservadeCitasMedicas20.Service.mapper.CitaMapper;

@Service
public class CitaServiceImpl implements CItaService{
	
	@Autowired
	private CitaRepository citaRepository;
	@Autowired
	private CitaMapper citaMapper;
	
	@Override
	public Collection<CitaResponse> findAllCitas() {
		Collection<Cita>listCitaResponses = citaRepository.findAll();
		return citaMapper.toListConsultorioToConsultorioResponse(listCitaResponses);
	}
	@Override
	public CitaResponse findByIdCita(Long idCita) {
		Cita cita = citaRepository.findById(idCita).orElse(null);
		return citaMapper.toCitaToCitaResponse(cita);
	}
	@Override
	public void saveCita(CitaRequest request) {
		Cita citaNew = new Cita();
		citaNew.setFecha_cita(request.getFecha_cita());
		citaNew.setHorario_cita(request.getHorario_cita());
		citaNew.setEstado_cita(request.getEstado_cita());
		citaNew.setMedico(request.getMedico());
		citaNew.setConsultorio(request.getConsultorio());
		citaNew.setPaciente(request.getPaciente());
		citaRepository.save(citaNew);
	}
	@Override
	public void updateCita(Long Id, CitaRequest request) {
		Cita cita = citaRepository.findById(Id).orElse(null);
		if (cita != null) {
			cita.setFecha_cita(request.getFecha_cita());
			cita.setHorario_cita(request.getHorario_cita());
			cita.setEstado_cita(request.getEstado_cita());
			cita.setMedico(request.getMedico());
			cita.setConsultorio(request.getConsultorio());
			cita.setPaciente(request.getPaciente());
			citaRepository.save(cita);
		}
	}
	@Override
	public void deleteCita(Long idCita) {
		Cita cita = citaRepository.findById(idCita).orElse(null);
		if (cita != null) {
			citaRepository.delete(cita);
		}
	}
}
