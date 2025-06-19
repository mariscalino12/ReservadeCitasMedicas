package com.elp.ReservadeCitasMedicas20.Service;

import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioResponse;

import java.util.Collection;

public interface ConsutorioService {
    Collection<ConsultorioResponse> findAllConsultorio();

    ConsultorioResponse findByIdConsultorio(Long idConsultorio);

    void  saveConsultorio(ConsultorioRequest request);

    void updateConsultorio(Long Id, ConsultorioRequest request);

    void deleteConsultorio(Long idConsultoio);

}
