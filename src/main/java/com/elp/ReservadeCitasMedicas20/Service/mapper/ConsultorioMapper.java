package com.elp.ReservadeCitasMedicas20.Service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioResponse;
import com.elp.ReservadeCitasMedicas20.Model.Consultorio;

@Component
public class ConsultorioMapper {

	public Collection<ConsultorioResponse> toListConsultorioToConsultorioResponse(
			Collection<Consultorio> listConsultorio) {
		Collection<ConsultorioResponse> listconsultorioResponses = new ArrayList<>();

		if (listConsultorio != null && !listConsultorio.isEmpty()) {
			for (Consultorio consultorio : listConsultorio) {
				ConsultorioResponse consultorioResponse = new ConsultorioResponse();
				consultorioResponse.setId_consultorio(consultorio.getId_consultorio());
				consultorioResponse.setNumero_consultorio(consultorio.getNumero_consultorio());
				consultorioResponse.setSeccion_consultorio(consultorio.getSeccion_consultorio());

				listconsultorioResponses.add(consultorioResponse);
			}
		}

		return listconsultorioResponses;
	}

	public ConsultorioResponse toConsultorioToConsultorioResponse(Consultorio consultorio) {
		ConsultorioResponse consultorioResponse = new ConsultorioResponse();
		if (consultorio != null) {
			consultorioResponse.setNumero_consultorio(consultorio.getNumero_consultorio());
			consultorioResponse.setSeccion_consultorio(consultorio.getSeccion_consultorio());
		}
		return consultorioResponse;
	}
}
