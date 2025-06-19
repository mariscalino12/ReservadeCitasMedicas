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
@Table(name = "consultorios")
public class Consultorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_consultorio;

	@Column(name = "numero_consultorio")
	private Integer numero_consultorio;

	@Column(name = "seccion_consultorio")
	private String seccion_consultorio;

	@OneToMany(mappedBy = "consultorio")
	private List<Cita> cita;

	public Long getId_consultorio() {
		return id_consultorio;
	}

	public void setId_consultorio(Long id_consultorio) {
		this.id_consultorio = id_consultorio;
	}

	public Integer getNumero_consultorio() {
		return numero_consultorio;
	}

	public void setNumero_consultorio(Integer numero_consultorio) {
		this.numero_consultorio = numero_consultorio;
	}

	public String getSeccion_consultorio() {
		return seccion_consultorio;
	}

	public void setSeccion_consultorio(String seccion_consultorio) {
		this.seccion_consultorio = seccion_consultorio;
	}

	public List<Cita> getCita() {
		return cita;
	}

	public void setCita(List<Cita> cita) {
		this.cita = cita;
	}

}
