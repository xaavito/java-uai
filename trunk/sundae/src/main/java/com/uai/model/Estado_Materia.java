package com.uai.model;

public enum Estado_Materia {
	DISPONIBLE("DISPONIBLE"),
	CURSADA("CURSADA"),
	RECUPERATORIO("RECUPERATORIO"),
	APROBADA("APROBADA");
	
	private String value;

    private Estado_Materia(String value) {
            this.setValue(value);
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
