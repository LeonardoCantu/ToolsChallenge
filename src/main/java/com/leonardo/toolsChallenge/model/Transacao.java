package com.leonardo.toolsChallenge.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tbl_transacao")
@EqualsAndHashCode
public class Transacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cartao")
    private String cartao;

    @JoinColumn(name = "id_descricao", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Descricao descricao;

    @JoinColumn(name = "id_forma_pagamento", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private FormaPagamento formaPagamento;

    public Transacao(Long id, String cartao, Descricao descricao, FormaPagamento formaPagamento) {
        this.id = id;
        this.cartao = cartao;
        this.descricao = descricao;
        this.formaPagamento = formaPagamento;
    }

    public Transacao() {
    }
}
