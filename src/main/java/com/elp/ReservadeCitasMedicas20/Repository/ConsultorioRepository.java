package com.elp.ReservadeCitasMedicas20.Repository;

import com.elp.ReservadeCitasMedicas20.Model.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long>{

}
