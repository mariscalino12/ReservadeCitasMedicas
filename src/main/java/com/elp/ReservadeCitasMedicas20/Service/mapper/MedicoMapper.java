package com.elp.ReservadeCitasMedicas20.Service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoResponse;
import com.elp.ReservadeCitasMedicas20.Model.Medico;

public class MedicoMapper {

	public Collection<MedicoResponse> toListMedicoToMedicoResponse(Collection<Medico> listMedico) {
		Collection<MedicoResponse> listmedicoResponses = new ArrayList<>();

		if (listMedico != null && !listMedico.isEmpty()) {
			for (Medico medico : listMedico) {
				MedicoResponse medicoResponse = new MedicoResponse();
				medicoResponse.setId_medico(medico.getId_medico());
				medicoResponse.setNombre(medico.getNombre());
				medicoResponse.setApellido_paterno(medico.getApellido_paterno());
				medicoResponse.setApellido_materno(medico.getApellido_materno());
				medicoResponse.setNumero_colegiado(medico.getNumero_colegiado());
				medicoResponse.setHorario_atencion(medico.getHorario_atencion());
				listmedicoResponses.add(medicoResponse);
			}
		}

		return listmedicoResponses;
	}

	public MedicoResponse toMedicoToMedicoResponse(Medico medico) {
		MedicoResponse medicoResponse = new MedicoResponse();
		if (medico != null) {
			medicoResponse.setNombre(medico.getNombre());
			medicoResponse.setApellido_paterno(medico.getApellido_paterno());
			medicoResponse.setApellido_materno(medico.getApellido_materno());
			medicoResponse.setNumero_colegiado(medico.getNumero_colegiado());
			medicoResponse.setHorario_atencion(medico.getHorario_atencion());
		}
		return medicoResponse;
	}
}
