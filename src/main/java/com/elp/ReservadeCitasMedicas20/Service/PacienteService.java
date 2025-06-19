package com.elp.ReservadeCitasMedicas20.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteResponse;

import java.util.Collection;

public interface PacienteService {
    Collection<PacienteResponse> findAllPaciente();

    PacienteResponse findByIdPaciente(Long idPaciente);

    void  savePaciente(PacienteRequest request);

    void updatePaciente(Long Id, PacienteRequest request);

    void deletePaciente(Long idPaciente);

}
