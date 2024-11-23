package com.example.cali.sostenible.backend.controller;


import com.example.cali.sostenible.backend.entity.Usuario;
import com.example.cali.sostenible.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/add-user")
    public ResponseEntity<Usuario> add(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.addUsuario(usuario));
    }

}
