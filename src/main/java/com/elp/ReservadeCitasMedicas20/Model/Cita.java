package com.elp.ReservadeCitasMedicas20.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cita;

	@Column(name = "fecha_cita")
	private String fecha_cita;

	@Column(name = "horario_cita")
	private String horario_cita;

	@Column(name = "Estado_cita")
	private String estado_cita;

	@ManyToOne
	@JoinColumn(name = "id_paciente", insertable = false, updatable = false)
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "id_medico", insertable = false, updatable = false)
	private Medico medico;

	@ManyToOne
	@JoinColumn(name = "id_consultorio", insertable = false, updatable = false)
	private Consultorio consultorio;

	public Long getId_cita() {
		return id_cita;
	}

	public void setId_cita(Long id_cita) {
		this.id_cita = id_cita;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

}
