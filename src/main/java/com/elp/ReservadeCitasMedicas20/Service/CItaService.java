package com.elp.ReservadeCitasMedicas20.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaResponse;

import java.util.Collection;

public interface CItaService {
    Collection<CitaResponse> findAllCitas();

    CitaResponse findByIdCita(Long idCita);

    void  saveCita(CitaRequest request);

    void updateCita(Long Id, CitaRequest request);

    void deleteCita(Long idCita);

}
