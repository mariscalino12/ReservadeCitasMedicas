package com.elp.ReservadeCitasMedicas20.Controller;

import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.EspecialidadResponse;

import com.elp.ReservadeCitasMedicas20.Service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("essalud/especialidad")
public class EspecialidadController {

    @Autowired
    EspecialidadService especialidadService;

    @GetMapping("/especialidades")
    public ResponseEntity<Collection<EspecialidadResponse>> getEspecialidad(){
        return  ResponseEntity.ok(especialidadService.findAllEspecialidad());
    }

    @GetMapping("/especialidad/{id}")
    public ResponseEntity<EspecialidadResponse> getEspecialidadById(@PathVariable Long id){
        return  ResponseEntity.ok(especialidadService.findByIdEspecialidad(id));
    }

    @PostMapping("/save/especialidad")
    public void saveEspecialidadById(@RequestBody EspecialidadRequest request){
        especialidadService.saveEspecialidad(request);
    }

    @PutMapping("/update/especialidad/{id}")
    public void updateEspecialidadById(@PathVariable Long id, @RequestBody EspecialidadRequest request){
        especialidadService.updateEspecialidad(id, request);
    }

    @DeleteMapping("/delete/especialidad/{id}")
    public void deleteEspecialidadById(@PathVariable Long id){
        especialidadService.deleteEspecialidad(id);
    }
}