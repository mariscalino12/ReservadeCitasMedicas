package com.elp.ReservadeCitasMedicas20.Controller.dto;

import java.time.LocalDate;

public class PacienteRequest {
	
	private String dni;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private LocalDate fecha_nacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String estado_asegurado;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstado_asegurado() {
		return estado_asegurado;
	}
	public void setEstado_asegurado(String estado_asegurado) {
		this.estado_asegurado = estado_asegurado;
	}
	
	
}
