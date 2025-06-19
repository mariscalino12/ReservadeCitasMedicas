package com.elp.ReservadeCitasMedicas20.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioResponse;

import java.util.Collection;

public interface UsuarioService {
    Collection<UsuarioResponse> findAllUsuario();

    UsuarioResponse findByIdUsuario(Long idUsuario);

    void  saveUsuario(UsuarioRequest request);

    void updateUusario(Long Id, UsuarioRequest request);

    void deleteUsuario(Long idUsuario);

}
