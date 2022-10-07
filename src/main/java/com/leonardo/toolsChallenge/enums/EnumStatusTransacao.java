package com.leonardo.toolsChallenge.enums;

public enum EnumStatusTransacao {

    AUTORIZADO(0, "Autorizado"),
    NEGADO(1, "Negado"),
    CANCELADO(2,"Cancelado")
    ;

    private Integer key;

    private String value;

    EnumStatusTransacao(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


}
