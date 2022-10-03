package com.leonardo.toolsChallenge.enums;

public enum EnumTipoPagamento {
    AVISTA(1, "Avista"),
    PARCELADO_LOJA(2, "Parcelado loja"),
    PARCELADO_EMISSOR(3, "Parcelado emissor"),
    ;

    private Integer key;

    private String value;

    EnumTipoPagamento(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
