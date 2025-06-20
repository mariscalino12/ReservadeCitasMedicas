package com.elp.ReservadeCitasMedicas20.Service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadResponse;
import com.elp.ReservadeCitasMedicas20.Model.Especialidad;

@Component
public class EspecialidadMapper {

	public Collection<EspecialidadResponse> toListEspecialidadToEspecialidadResponse(
			Collection<Especialidad> listEspecialidad) {
		Collection<EspecialidadResponse> listespecialidadResponses = new ArrayList<>();

		if (listEspecialidad != null && !listEspecialidad.isEmpty()) {
			for (Especialidad especialidad : listEspecialidad) {
				EspecialidadResponse especialidadResponse = new EspecialidadResponse();
				especialidadResponse.setId_especialidad(especialidad.getId_especialidad());
				especialidadResponse.setNombre_especialidad(especialidad.getNombre_especialidad());
				especialidadResponse.setMedico(especialidad.getMedico());

				listespecialidadResponses.add(especialidadResponse);
			}
		}

		return listespecialidadResponses;
	}

	public EspecialidadResponse toEspecialidadToEspecialidadResponse(Especialidad especialidad) {
		EspecialidadResponse especialidadResponse = new EspecialidadResponse();
		if (especialidad != null) {
			especialidadResponse.setId_especialidad(especialidad.getId_especialidad());
			especialidadResponse.setNombre_especialidad(especialidad.getNombre_especialidad());
			especialidadResponse.setMedico(especialidad.getMedico());
		}
		return especialidadResponse;
	}
}
