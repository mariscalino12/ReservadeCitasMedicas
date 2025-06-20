package com.elp.ReservadeCitasMedicas20.Controller;

import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioResponse;


import com.elp.ReservadeCitasMedicas20.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("essalud/paciente")
public class PacienteController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/pacientes")
    public ResponseEntity<Collection<UsuarioResponse>> getUsuario(){
        return  ResponseEntity.ok(usuarioService.findAllUsuario());
    }

    @GetMapping("/paciente/{id}")
    public ResponseEntity<UsuarioResponse> getPacienteById(@PathVariable Long id){
        return  ResponseEntity.ok(usuarioService.findByIdUsuario(id));
    }

    @PostMapping("/save/paciente")
    public void savePacienteById(@RequestBody UsuarioRequest request){
        usuarioService.saveUsuario(request);
    }

    @PutMapping("/update/paciente/{id}")
    public void updatePacientesById(@PathVariable Long id, @RequestBody UsuarioRequest request){
        usuarioService.updateUusario(id, request);
    }

    @DeleteMapping("/delete/paciente/{id}")
    public void deletePacientesById(@PathVariable Long id){
        usuarioService.deleteUsuario(id);
    }
}

