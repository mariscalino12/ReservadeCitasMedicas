package com.elp.ReservadeCitasMedicas20.Controller.dto;

public class CitaRequest {
	
	private String fecha_cita;
	private String horario_cita;
	private String estado_cita;
	
	public String getFecha_cita() {
		return fecha_cita;
	}
	public void setFecha_cita(String fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	public String getHorario_cita() {
		return horario_cita;
	}
	public void setHorario_cita(String horario_cita) {
		this.horario_cita = horario_cita;
	}
	public String getEstado_cita() {
		return estado_cita;
	}
	public void setEstado_cita(String estado_cita) {
		this.estado_cita = estado_cita;
	}
	
}
