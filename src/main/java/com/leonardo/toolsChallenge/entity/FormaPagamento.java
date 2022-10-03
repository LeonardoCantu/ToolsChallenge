package com.leonardo.toolsChallenge.entity;

import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import com.leonardo.toolsChallenge.enums.EnumTipoPagamento;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tbl_forma_pagamento")
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Convert(converter = EnumStatusTransacao.class)
    @Column(name = "tipo")
    private EnumTipoPagamento tipo;

    @Column(name = "parcelas")
    private Integer parcelas;
}
