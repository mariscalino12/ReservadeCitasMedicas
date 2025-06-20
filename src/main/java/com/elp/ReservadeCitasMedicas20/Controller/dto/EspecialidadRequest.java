package com.elp.ReservadeCitasMedicas20.Controller.dto;

import com.elp.ReservadeCitasMedicas20.Model.Medico;

public class EspecialidadRequest {
	
	private String nombre_especialidad;
	private Medico medico;
	
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getNombre_especialidad() {
		return nombre_especialidad;
	}

	public void setNombre_especialidad(String nombre_especialidad) {
		this.nombre_especialidad = nombre_especialidad;
	}
	
}
