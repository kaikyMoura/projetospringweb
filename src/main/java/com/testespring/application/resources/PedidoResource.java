package com.testespring.application.resources;

import com.testespring.application.entities.Pedido;
import com.testespring.application.services.PedidoService;
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
@RequestMapping(value = "/orders")
public class PedidoResource {
    @Autowired
    private PedidoService service;

    //Endpoint de test
        @GetMapping
        public ResponseEntity<List<Pedido>> findAll() {
            List<Pedido> list = service.findAll();
            return ResponseEntity.ok().body(list);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<Pedido> findById(@PathVariable Long id) {
            Pedido obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
        }
    }

