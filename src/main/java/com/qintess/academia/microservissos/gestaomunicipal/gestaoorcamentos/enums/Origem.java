package com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.enums;

public enum Origem {

	FEDERAL("FEDERAL"), ESTADUAL("ESTADUAL"), MUNICIPAL("MUNICIPAL");

    private String value;

    private Origem(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}


