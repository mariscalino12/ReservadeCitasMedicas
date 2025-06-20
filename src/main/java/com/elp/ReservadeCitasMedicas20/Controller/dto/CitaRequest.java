package com.elp.ReservadeCitasMedicas20.Controller.dto;

import com.elp.ReservadeCitasMedicas20.Model.Consultorio;
import com.elp.ReservadeCitasMedicas20.Model.Medico;
import com.elp.ReservadeCitasMedicas20.Model.Paciente;

public class CitaRequest {
	
	private String fecha_cita;
	private String horario_cita;
	private String estado_cita;
	private Medico medico;
	private Paciente paciente;
	private Consultorio consultorio;
	
	
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
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
