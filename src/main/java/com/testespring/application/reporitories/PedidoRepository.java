package com.testespring.application.reporitories;

import com.testespring.application.entities.Pedido;
import com.testespring.application.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
