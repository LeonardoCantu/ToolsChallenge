package com.leonardo.toolsChallenge.entity;

import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity(name = "tbl_descricao")
public class Descricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    @Column(name = "estabelecimento")
    private String estabelecimento;

    @Column(name = "nsu")
    private Integer nsu;

    @Column(name = "codigo_autorizacao")
    private String codigoAutorizacao;

    @Column(name = "status")
    @Convert(converter = EnumStatusTransacao.class)
    private EnumStatusTransacao status;

}
