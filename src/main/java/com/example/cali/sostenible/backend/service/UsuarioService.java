package com.example.cali.sostenible.backend.service;

import com.example.cali.sostenible.backend.entity.Usuario;
import com.example.cali.sostenible.backend.repository.UsuarioRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmailService emailService;

    //Manual methods

    public Usuario addUsuario(Usuario usuario){
        emailService.sendEmail(
                usuario.getEmail(),
                "Bienvenido a nuestra sitio pronto nos contacteremos contigo",
                "Gracias por registrarte, " + usuario.getName() + "!"
        );
        return usuarioRepository.save(usuario);
    }
}
