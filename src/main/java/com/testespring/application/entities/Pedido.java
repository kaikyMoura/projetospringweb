package com.testespring.application.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

//Order
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "tb_orders")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd't'HH:mm:ss'Z'", timezone = "GMT")
    @EqualsAndHashCode.Exclude
    private Instant moment;

    @Getter @Setter
    @EqualsAndHashCode.Exclude
    @ManyToOne //Associação entre pedido e usuarui (muitos para um)
    @JoinColumn(name = "client_id")
    private Usuario client;

    public Pedido(Long id, Instant moment, Usuario client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }
}
