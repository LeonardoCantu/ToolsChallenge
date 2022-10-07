package com.leonardo.toolsChallenge.model;

import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tbl_descricao")
@EqualsAndHashCode
public class Descricao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private EnumStatusTransacao status;

    public Descricao() {
    }

    public Descricao(Long id, BigDecimal valor, Date dataHora, String estabelecimento, Integer nsu, String codigoAutorizacao, EnumStatusTransacao status) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
        this.estabelecimento = estabelecimento;
        this.nsu = nsu;
        this.codigoAutorizacao = codigoAutorizacao;
        this.status = status;
    }
}
