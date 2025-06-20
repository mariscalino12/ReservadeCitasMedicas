package com.elp.ReservadeCitasMedicas20.Controller;

import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.PacienteResponse;
import com.elp.ReservadeCitasMedicas20.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("essalud/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @GetMapping("/pacientes")
    public ResponseEntity<Collection<PacienteResponse>> getPaciente(){
        return  ResponseEntity.ok(pacienteService.findAllPaciente());
    }

    @GetMapping("/paciente/{id}")
    public ResponseEntity<PacienteResponse> getPacienteById(@PathVariable Long id){
        return  ResponseEntity.ok(pacienteService.findByIdPaciente(id));
    }

    @PostMapping("/save/paciente")
    public void savePacienteById(@RequestBody PacienteRequest request){
    	pacienteService.savePaciente(request);
    }

    @PutMapping("/update/paciente/{id}")
    public void updatePacientesById(@PathVariable Long id, @RequestBody PacienteRequest request){
    	pacienteService.updatePaciente(id, request);
    }

    @DeleteMapping("/delete/paciente/{id}")
    public void deletePacientesById(@PathVariable Long id){
    	pacienteService.deletePaciente(id);
    }
}

