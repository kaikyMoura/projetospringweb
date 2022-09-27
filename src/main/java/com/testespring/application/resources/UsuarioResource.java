package com.testespring.application.resources;

import com.testespring.application.entities.Usuario;
import com.testespring.application.services.UsuarioService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Resource
@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {
    @Autowired
    private UsuarioService service;

    //Endpoint de test
        @GetMapping
        public ResponseEntity<List<Usuario>> findAll() {
            List<Usuario> list = service.findAll();
            return ResponseEntity.ok().body(list);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<Usuario> findById(@PathVariable Long id) {
            Usuario obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
        }
    }

