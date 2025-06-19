package com.elp.ReservadeCitasMedicas20.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadResponse;

import java.util.Collection;

public interface EspecialidadService {
    Collection<EspecialidadResponse> findAllEspecialidad();

    EspecialidadResponse findByIdEspecialidad(Long idEspecialidad);

    void  saveEspecialidad(EspecialidadRequest request);

    void updateEspecialidad(Long Id, EspecialidadRequest request);

    void deleteEspecialidad(Long idEspecialidad);

}
