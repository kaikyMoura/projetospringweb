package com.testespring.application.resources;

import com.testespring.application.entities.Usuario;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Resource
@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {
        @GetMapping
        public ResponseEntity<Usuario> findAll() {
            Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "99999999", "12345");
            return ResponseEntity.ok().body(u);
        }
    }

