package com.elp.ReservadeCitasMedicas20.Controller.dto;

import com.elp.ReservadeCitasMedicas20.Model.Medico;

public class EspecialidadResponse {
	
	private Long id_especialidad;
	private String nombre_especialidad;
	private Medico medico;
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Long getId_especialidad() {
		return id_especialidad;
	}
	public void setId_especialidad(Long id_especialidad) {
		this.id_especialidad = id_especialidad;
	}
	public String getNombre_especialidad() {
		return nombre_especialidad;
	}
	public void setNombre_especialidad(String nombre_especialidad) {
		this.nombre_especialidad = nombre_especialidad;
	}
	
}
