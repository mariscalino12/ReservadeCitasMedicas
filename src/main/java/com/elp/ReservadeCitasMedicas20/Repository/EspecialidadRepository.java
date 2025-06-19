package com.elp.ReservadeCitasMedicas20.Repository;

import com.elp.ReservadeCitasMedicas20.Model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Long>{
}
