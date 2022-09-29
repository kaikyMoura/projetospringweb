package com.testespring.application.config;

import com.testespring.application.entities.Pedido;
import com.testespring.application.entities.Usuario;
import com.testespring.application.reporitories.PedidoRepository;
import com.testespring.application.reporitories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

//Injeção de dependencia
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario u1 = new Usuario(null, "Agnaldo Timoteo", "agtimoteo@gmail.com", "988888888", "123456");
        Usuario u2 = new Usuario(null, "Tim Maia", "timmaia@gmail.com", "977777777", "123456");
        Usuario u3 = new Usuario(null, "Julia Roberts", "juliaroberts@gmail.com", "977777777", "1234567");
        Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        // Salva esses novos objetos no banco de dados
        usuarioRepository.saveAll(Arrays.asList(u1,u2, u3));
        pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
    }
}
