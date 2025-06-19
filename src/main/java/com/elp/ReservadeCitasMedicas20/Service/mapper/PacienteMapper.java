package com.elp.ReservadeCitasMedicas20.Service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteResponse;
import com.elp.ReservadeCitasMedicas20.Model.Paciente;

public class PacienteMapper {

	public Collection<PacienteResponse> toListPacienteToPacienteResponse(Collection<Paciente> listPaciente) {
		Collection<PacienteResponse> listpacienteResponses = new ArrayList<>();

		if (listPaciente != null && !listPaciente.isEmpty()) {
			for (Paciente paciente : listPaciente) {
				PacienteResponse pacienteResponse = new PacienteResponse();
				pacienteResponse.setId_paciente(paciente.getId_paciente());
				pacienteResponse.setDni(paciente.getDni());
				pacienteResponse.setNombre(paciente.getNombre());
				pacienteResponse.setApellido_paterno(paciente.getApellido_paterno());
				pacienteResponse.setApellido_materno(paciente.getApellido_materno());
				pacienteResponse.setFecha_nacimiento(paciente.getFecha_nacimiento());
				pacienteResponse.setGenero(paciente.getGenero());
				pacienteResponse.setDireccion(paciente.getDireccion());
				pacienteResponse.setTelefono(paciente.getTelefono());
				pacienteResponse.setEstado_asegurado(paciente.getEstado_asegurado());

				listpacienteResponses.add(pacienteResponse);
			}
		}

		return listpacienteResponses;
	}

	public PacienteResponse toPacienteTopacienteResponse(Paciente paciente) {
		PacienteResponse pacienteresponse = new PacienteResponse();
		if (paciente != null) {
			pacienteresponse.setDni(paciente.getDni());
			pacienteresponse.setNombre(paciente.getNombre());
			pacienteresponse.setApellido_paterno(paciente.getApellido_paterno());
			pacienteresponse.setApellido_materno(paciente.getApellido_materno());
			pacienteresponse.setFecha_nacimiento(paciente.getFecha_nacimiento());
			pacienteresponse.setGenero(paciente.getGenero());
			pacienteresponse.setDireccion(paciente.getDireccion());
			pacienteresponse.setTelefono(paciente.getTelefono());
			pacienteresponse.setEstado_asegurado(paciente.getEstado_asegurado());
		}
		return pacienteresponse;
	}
}
