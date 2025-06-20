package com.elp.ReservadeCitasMedicas20.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "medicos")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_medico;

	@Column(name = "nombre", length = 100)
	private String nombre;

	@Column(name = "apellido_paterno", length = 100)
	private String apellido_paterno;

	@Column(name = "apellido_materno", length = 100)
	private String apellido_materno;

	@Column(name = "numero_colegiado", length = 10)
	private Integer numero_colegiado;

	@Column(name = "horario_atencion", length = 100)
	private String horario_atencion;

	@OneToMany(mappedBy = "medico")
	private List<Especialidad> especialidad;

	@OneToMany(mappedBy = "medico")
	private List<Cita> cita;

	public Long getId_medico() {
		return id_medico;
	}

	public void setId_medico(Long id_medico) {
		this.id_medico = id_medico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public Integer getNumero_colegiado() {
		return numero_colegiado;
	}

	public void setNumero_colegiado(Integer numero_colegiado) {
		this.numero_colegiado = numero_colegiado;
	}

	public String getHorario_atencion() {
		return horario_atencion;
	}

	public void setHorario_atencion(String horario_atencion) {
		this.horario_atencion = horario_atencion;
	}

	public List<Especialidad> getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(List<Especialidad> especialidad) {
		this.especialidad = especialidad;
	}

	public List<Cita> getCita() {
		return cita;
	}

	public void setCita(List<Cita> cita) {
		this.cita = cita;
	}

}
