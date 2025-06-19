package com.elp.ReservadeCitasMedicas20.Repository;

import com.elp.ReservadeCitasMedicas20.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
