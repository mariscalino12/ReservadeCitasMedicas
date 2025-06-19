package com.elp.ReservadeCitasMedicas20.Service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoResponse;
import com.elp.ReservadeCitasMedicas20.Model.Medico;
import com.elp.ReservadeCitasMedicas20.Repository.MedicoRepository;
import com.elp.ReservadeCitasMedicas20.Service.MedicoService;
import com.elp.ReservadeCitasMedicas20.Service.mapper.MedicoMapper;

@Service
public class MedicoServiceImpl implements MedicoService{

	@Autowired
	private MedicoRepository medicoRepository;
	@Autowired
	private MedicoMapper medicoMapper;
	
	@Override
	public Collection<MedicoResponse> findAllMedico() {
		Collection<Medico> listMedicoResponses= medicoRepository.findAll();
		return medicoMapper.toListMedicoToMedicoResponse(listMedicoResponses);
	}
	@Override
	public MedicoResponse findByIdMedico(Long idMedico) {
		Medico medico = medicoRepository.findById(idMedico).orElse(null);
		return medicoMapper.toMedicoToMedicoResponse(medico);
	}
	@Override
	public void saveMedico(MedicoRequest request) {
		Medico medicoNew = new Medico();
		medicoNew.setNombre(request.getNombre());
		medicoNew.setApellido_paterno(request.getApellido_paterno());
		medicoNew.setApellido_materno(request.getApellido_materno());
		medicoNew.setNumero_colegiado(request.getNumero_colegiado());
		medicoNew.setHorario_atencion(request.getHorario_atencion());
		medicoRepository.save(medicoNew);
	}
	@Override
	public void updateMedico(Long Id, MedicoRequest request) {
		Medico medico =medicoRepository.findById(Id).orElse(null);
		if (medico != null) {
			medico.setNombre(request.getNombre());
			medico.setApellido_paterno(request.getApellido_paterno());
			medico.setApellido_materno(request.getApellido_materno());
			medico.setNumero_colegiado(request.getNumero_colegiado());
			medico.setHorario_atencion(request.getHorario_atencion());
			medicoRepository.save(medico);
		}
		
	}
	@Override
	public void deleteMedico(Long idMedico) {
		Medico medico =medicoRepository.findById(idMedico).orElse(null);
		if (medico != null) {
			medicoRepository.delete(medico);
		}
	}
}
