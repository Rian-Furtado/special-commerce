package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity // Transforma minha classe/objeto em uma tabela no banco de dados.
@Table(name = "tb_order") // permite que eu consiga mudar o nome da tabela no banco.
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private OrderStatus status;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;



}
