package com.leonardo.toolsChallenge.enums;

public enum EnumStatusTransacao {

    AUTORIZADO(1, "Autorizado"),
    NEGADO(2, "Negado"),
    ;

    private Integer key;

    private String value;

    EnumStatusTransacao(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


}
