package com.elp.ReservadeCitasMedicas20.Controller;

import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.MedicoResponse;


import com.elp.ReservadeCitasMedicas20.Service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("essalud/medico")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @GetMapping("/medicos")
    public ResponseEntity<Collection<MedicoResponse>> getMedico(){
        return  ResponseEntity.ok(medicoService.findAllMedico());
    }

    @GetMapping("/medico/{id}")
    public ResponseEntity<MedicoResponse> getMedicoById(@PathVariable Long id){
        return  ResponseEntity.ok(medicoService.findByIdMedico(id));
    }

    @PostMapping("/save/medico")
    public void saveMedicoById(@RequestBody MedicoRequest request){
        medicoService.saveMedico(request);
    }

    @PutMapping("/update/medico/{id}")
    public void updateMedicosById(@PathVariable Long id, @RequestBody MedicoRequest request){
        medicoService.updateMedico(id, request);
    }

    @DeleteMapping("/delete/medico/{id}")
    public void deleteMedicoById(@PathVariable Long id){
        medicoService.deleteMedico(id);
    }
}