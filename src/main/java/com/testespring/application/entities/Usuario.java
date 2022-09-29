package com.testespring.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_users")
@EqualsAndHashCode
@NoArgsConstructor
public class Usuario implements  Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;
    @EqualsAndHashCode.Exclude
    @Getter @Setter
    private String name;
    @EqualsAndHashCode.Exclude
    @Getter @Setter
    private String email;
    @EqualsAndHashCode.Exclude
    @Getter @Setter
    private String phone;
    @EqualsAndHashCode.Exclude
    @Getter @Setter
    private String password;

    @Getter
    @JsonIgnore //"Impede" um loop entre o pedido e o usuario no momento de acessar o endpoint
    @OneToMany(mappedBy = "client") //Associação entre usuario e pedido (um pra muitos)
    @EqualsAndHashCode.Exclude
    private List<Pedido> pedidos = new ArrayList<>();

    public Usuario(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
