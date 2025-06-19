package com.elp.ReservadeCitasMedicas20.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoResponse;

import java.util.Collection;

public interface MedicoService {
    Collection<MedicoResponse> findAllMedico();

    MedicoResponse findByIdMedico(Long idMedico);

    void  saveMedico(MedicoRequest request);

    void updateMedico(Long Id, MedicoRequest request);

    void deleteMedico(Long idMedico);

}
