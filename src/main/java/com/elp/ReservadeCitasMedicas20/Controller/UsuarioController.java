package com.elp.ReservadeCitasMedicas20.Controller;


import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioRequest;
import com.elp.ReservadeCitasMedicas20.Controller.dto.UsuarioResponse;
import com.elp.ReservadeCitasMedicas20.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("essalud/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<Collection<UsuarioResponse>> getUsuario(){
        return  ResponseEntity.ok(usuarioService.findAllUsuario());
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<UsuarioResponse> getUsuarioById(@PathVariable Long id){
        return  ResponseEntity.ok(usuarioService.findByIdUsuario(id));
    }

    @PostMapping("/save/usuario")
    public void saveUsuariosById(@RequestBody UsuarioRequest request){
        usuarioService.saveUsuario(request);
    }

    @PutMapping("/update/usuario/{id}")
    public void updateUsuariosById(@PathVariable Long id, @RequestBody UsuarioRequest request){
        usuarioService.updateUusario(id, request);
    }

    @DeleteMapping("/delete/usuario/{id}")
    public void deleteUsuariosById(@PathVariable Long id){
        usuarioService.deleteUsuario(id);
    }
}
