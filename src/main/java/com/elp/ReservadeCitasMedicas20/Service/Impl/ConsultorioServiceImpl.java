package com.elp.ReservadeCitasMedicas20.Service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioResponse;
import com.elp.ReservadeCitasMedicas20.Model.Consultorio;
import com.elp.ReservadeCitasMedicas20.Repository.ConsultorioRepository;
import com.elp.ReservadeCitasMedicas20.Service.ConsutorioService;
import com.elp.ReservadeCitasMedicas20.Service.mapper.ConsultorioMapper;

@Service
public class ConsultorioServiceImpl implements ConsutorioService {
	
	@Autowired
	private ConsultorioRepository consultorioRepository;
	@Autowired
	private ConsultorioMapper consultorioMapper;
	
	@Override
	public Collection<ConsultorioResponse> findAllConsultorio() {
		Collection<Consultorio> listConsulorioResponses = consultorioRepository.findAll();
		return consultorioMapper.toListConsultorioToConsultorioResponse(listConsulorioResponses);
	}
	@Override
	public ConsultorioResponse findByIdConsultorio(Long idConsultorio) {
		Consultorio consultorio = consultorioRepository.findById(idConsultorio).orElse(null);
		return consultorioMapper.toConsultorioToConsultorioResponse(consultorio);
	}
	@Override
	public void saveConsultorio(ConsultorioRequest request) {
		Consultorio consultorioNew = new Consultorio();
		consultorioNew.setNumero_consultorio(request.getNumero_consultorio());
		consultorioNew.setSeccion_consultorio(request.getSeccion_consultorio());
		consultorioRepository.save(consultorioNew);
		
	}
	@Override
	public void updateConsultorio(Long Id, ConsultorioRequest request) {
		Consultorio consultorio = consultorioRepository.findById(Id).orElse(null);
		if (consultorio != null) {
			consultorio.setNumero_consultorio(request.getNumero_consultorio());
			consultorio.setSeccion_consultorio(request.getSeccion_consultorio());
			consultorioRepository.save(consultorio);
		}
	}
	@Override
	public void deleteConsultorio(Long idConsultoio) {
		Consultorio consultorio = consultorioRepository.findById(idConsultoio).orElse(null);
		if (consultorio != null) {
			consultorioRepository.delete(consultorio);
		}
	}
	
	
}
