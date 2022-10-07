package com.leonardo.toolsChallenge.enums;

public enum EnumTipoPagamento {
    AVISTA(0, "Avista"),
    PARCELADO_LOJA(1, "Parcelado loja"),
    PARCELADO_EMISSOR(2, "Parcelado emissor"),
    ;

    private Integer key;

    private String value;

    EnumTipoPagamento(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
