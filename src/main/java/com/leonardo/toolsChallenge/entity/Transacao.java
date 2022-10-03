package com.leonardo.toolsChallenge.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tbl_transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "cartao")
    private String cartao;

    @JoinColumn(name = "id_descricao", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.LAZY)
    private Descricao descricao;

    @JoinColumn(name = "id_forma_pagamento", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.LAZY)
    private FormaPagamento formaPagamento;

}
