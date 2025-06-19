package com.elp.ReservadeCitasMedicas20.Repository;

import com.elp.ReservadeCitasMedicas20.Model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}
