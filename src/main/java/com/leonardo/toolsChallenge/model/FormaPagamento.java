package com.leonardo.toolsChallenge.model;

import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import com.leonardo.toolsChallenge.enums.EnumTipoPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tbl_forma_pagamento")
@EqualsAndHashCode
public class FormaPagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo")
    private EnumTipoPagamento tipo;

    @Column(name = "parcelas")
    private Integer parcelas;

    public FormaPagamento(Long id, EnumTipoPagamento tipo, Integer parcelas) {
        this.id = id;
        this.tipo = tipo;
        this.parcelas = parcelas;
    }

    public FormaPagamento() {
    }
}
