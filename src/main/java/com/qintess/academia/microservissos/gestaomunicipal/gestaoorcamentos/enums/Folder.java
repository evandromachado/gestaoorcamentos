package com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.enums;

public enum Folder {

	HEALTH("HEALTH"), EDUCATION("EDUCATION"), SPORTS("SPORTS"), INFRASTRUCTURE("INFRASTRUCTURE"), URBAN_SECURITY("URBAN_SECURITY"), JUSTICE("JUSTICE"), TRANSPORTS("TRANSPORTS");

    private String value;

    private Folder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}


