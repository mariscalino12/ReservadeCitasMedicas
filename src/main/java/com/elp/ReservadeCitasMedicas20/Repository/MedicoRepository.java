package com.elp.ReservadeCitasMedicas20.Repository;

import com.elp.ReservadeCitasMedicas20.Model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
