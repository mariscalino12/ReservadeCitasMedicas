package com.elp.ReservadeCitasMedicas20.Controller.dto;



public class ConsultorioResponse {
	
	private Long id_consultorio;
	private Integer numero_consultorio;
	private String seccion_consultorio;
	
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
	
	
}
