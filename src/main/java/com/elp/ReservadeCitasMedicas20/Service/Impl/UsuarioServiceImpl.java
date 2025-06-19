package com.elp.ReservadeCitasMedicas20.Service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioResponse;
import com.elp.ReservadeCitasMedicas20.Model.Usuario;
import com.elp.ReservadeCitasMedicas20.Repository.UsuarioRepository;
import com.elp.ReservadeCitasMedicas20.Service.UsuarioService;
import com.elp.ReservadeCitasMedicas20.Service.mapper.UsuarioMapper;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Override
	public Collection<UsuarioResponse> findAllUsuario() {
		Collection<Usuario> listUsuarioResponses = usuarioRepository.findAll();
		return usuarioMapper.toListUsuarioToUsuarioResponse(listUsuarioResponses);
	}
	@Override
	public UsuarioResponse findByIdUsuario(Long idUsuario) {
		Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
		return usuarioMapper.toUsuarioToUsuarioResponse(usuario);
	}
	@Override
	public void saveUsuario(UsuarioRequest request) {
		Usuario usuarioNew = new Usuario();
		usuarioNew.setNombre_usuario(request.getNombre_usuario());
		usuarioNew.setEmail(request.getEmail());
		usuarioNew.setContraseña(request.getContraseña());
		usuarioNew.setRol(request.getRol());
		usuarioRepository.save(usuarioNew);
		
	}
	@Override
	public void updateUusario(Long Id, UsuarioRequest request) {
		Usuario usuario = usuarioRepository.findById(Id).orElse(null);
		
		if (usuario != null) {
			usuario.setNombre_usuario(request.getNombre_usuario());
			usuario.setEmail(request.getEmail());
			usuario.setContraseña(request.getContraseña());
			usuario.setRol(request.getRol());
			usuarioRepository.save(usuario);
		}
	}
	@Override
	public void deleteUsuario(Long idUsuario) {
		Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
		
		if (usuario != null) {
			usuarioRepository.delete(usuario);
		}
	}
}
