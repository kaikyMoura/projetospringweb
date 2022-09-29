package com.testespring.application.services;

import com.testespring.application.entities.Pedido;
import com.testespring.application.entities.Usuario;
import com.testespring.application.reporitories.PedidoRepository;
import com.testespring.application.reporitories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll() {
        return repository.findAll();
    }

    public Pedido findById(Long id) {
        Optional<Pedido> obj = repository.findById(id);
        return obj.get();
    }
}
