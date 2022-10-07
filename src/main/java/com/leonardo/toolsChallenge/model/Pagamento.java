package com.leonardo.toolsChallenge.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tbl_pagamento")
@EqualsAndHashCode
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "id_transacao", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Transacao transacao;

    public Pagamento(Long id, Transacao transacao) {
        this.id = id;
        this.transacao = transacao;
    }

    public Pagamento() {
    }


}
