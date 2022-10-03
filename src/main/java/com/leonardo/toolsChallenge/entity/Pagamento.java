package com.leonardo.toolsChallenge.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tbl_pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "id_transacao", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.LAZY)
    private Transacao transacao;
}
