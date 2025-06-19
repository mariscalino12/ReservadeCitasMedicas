package com.elp.ReservadeCitasMedicas20.Repository;


import com.elp.ReservadeCitasMedicas20.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
