package com.elp.ReservadeCitasMedicas20.Controller;

import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.ConsultorioResponse;


import com.elp.ReservadeCitasMedicas20.Service.ConsutorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("essalud/consultorio")
public class ConsultorioController {

    @Autowired
    ConsutorioService consultorioService;

    @GetMapping("/consultorios")
    public ResponseEntity<Collection<ConsultorioResponse>> getConsultorio(){
        return ResponseEntity.ok(consultorioService.findAllConsultorio());
    }

    @GetMapping("/consultorio/{id}")
    public ResponseEntity<ConsultorioResponse> getConsultorioById(@PathVariable Long id){
        return ResponseEntity.ok(consultorioService.findByIdConsultorio(id));
    }

    @PostMapping("/save/consultorio")
    public void saveConsultorio(@RequestBody ConsultorioRequest request){
        consultorioService.saveConsultorio(request);
    }

    @PutMapping("/update/consultorio/{id}")
    public void updateConsultorios(@PathVariable Long id, @RequestBody ConsultorioRequest request){
        consultorioService.updateConsultorio(id, request);
    }

    @DeleteMapping("/delete/consultorio/{id}")
    public void deleteConsultorios(@PathVariable Long id){
        consultorioService.deleteConsultorio(id);
    }
}