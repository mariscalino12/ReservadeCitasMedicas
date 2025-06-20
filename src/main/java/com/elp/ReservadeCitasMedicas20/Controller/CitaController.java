package com.elp.ReservadeCitasMedicas20.Controller;

import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.CitaResponse;

import com.elp.ReservadeCitasMedicas20.Service.CItaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("essalud/cita")
public class CitaController {

    @Autowired
    CItaService citaService;

    @GetMapping("/citas")
    public ResponseEntity<Collection<CitaResponse>> getCitas() {
        return ResponseEntity.ok(citaService.findAllCitas());
    }

    @GetMapping("/citas/{id}")
    public ResponseEntity<CitaResponse> getCitaById(@PathVariable Long id) {
        return ResponseEntity.ok(citaService.findByIdCita(id));
    }

    @PostMapping("/save/citas")
    public void saveCitasById(@RequestBody CitaRequest request) {
        citaService.saveCita(request);
    }

    @PutMapping("/update/citas/{id}")
    public void updateCitaById(@PathVariable Long id, @RequestBody CitaRequest request) {
        citaService.updateCita(id, request);
    }

    @DeleteMapping("/delete/citas/{id}")
    public void deleteCitaById(@PathVariable Long id) {
        citaService.deleteCita(id);
    }
}