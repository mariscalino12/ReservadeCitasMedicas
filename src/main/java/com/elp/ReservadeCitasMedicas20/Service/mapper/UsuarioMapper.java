package com.elp.ReservadeCitasMedicas20.Service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioResponse;
import com.elp.ReservadeCitasMedicas20.Model.Usuario;

@Component
public class UsuarioMapper {

	public Collection<UsuarioResponse> toListUsuarioToUsuarioResponse(Collection<Usuario> listUsuario) {
		Collection<UsuarioResponse> listusuarioResponses = new ArrayList<>();

		if (listUsuario != null && !listUsuario.isEmpty()) {
			for (Usuario usuario : listUsuario) {
				UsuarioResponse usuarioResponse = new UsuarioResponse();
				usuarioResponse.setId_usuario(usuario.getId_usuario());
				usuarioResponse.setNombre_usuario(usuario.getNombre_usuario());
				usuarioResponse.setEmail(usuario.getEmail());
				usuarioResponse.setContraseña(usuario.getContraseña());
				usuarioResponse.setRol(usuario.getRol());
				listusuarioResponses.add(usuarioResponse);
			}
		}

		return listusuarioResponses;
	}

	public UsuarioResponse toUsuarioToUsuarioResponse(Usuario usuario) {
		UsuarioResponse usuarioResponse = new UsuarioResponse();
		if (usuario != null) {
			usuarioResponse.setNombre_usuario(usuario.getNombre_usuario());
			usuarioResponse.setEmail(usuario.getEmail());
			usuarioResponse.setContraseña(usuario.getContraseña());
			usuarioResponse.setRol(usuario.getRol());
		}
		return usuarioResponse;
	}
}
