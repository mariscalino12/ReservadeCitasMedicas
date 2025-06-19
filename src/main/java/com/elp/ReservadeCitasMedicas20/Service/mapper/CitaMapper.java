package com.elp.ReservadeCitasMedicas20.Service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaResponse;
import com.elp.ReservadeCitasMedicas20.Model.Cita;

public class CitaMapper {

	public Collection<CitaResponse> toListConsultorioToConsultorioResponse(Collection<Cita> listCita) {
		Collection<CitaResponse> listcitaResponses = new ArrayList<>();

		if (listCita != null && !listCita.isEmpty()) {
			for (Cita cita : listCita) {
				CitaResponse citaResponse = new CitaResponse();
				citaResponse.setId_cita(cita.getId_cita());
				citaResponse.setFecha_cita(cita.getFecha_cita());
				citaResponse.setHorario_cita(cita.getHorario_cita());
				citaResponse.setEstado_cita(cita.getEstado_cita());

				listcitaResponses.add(citaResponse);
			}
		}

		return listcitaResponses;
	}

	public CitaResponse toCitaToCitaResponse(Cita cita) {
		CitaResponse citaResponse = new CitaResponse();
		if (cita != null) {
			citaResponse.setFecha_cita(cita.getFecha_cita());
			citaResponse.setHorario_cita(cita.getHorario_cita());
			citaResponse.setEstado_cita(cita.getEstado_cita());
		}
		return citaResponse;
	}
}
