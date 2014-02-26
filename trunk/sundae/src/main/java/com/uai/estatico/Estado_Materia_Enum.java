package com.uai.estatico;

public enum Estado_Materia_Enum {
	DISPONIBLE("DISPONIBLE"),
	CURSADA("CURSADA"),
	RECUPERATORIO("RECUPERATORIO"),
	APROBADA("APROBADA");
	
	private String value;

    private Estado_Materia_Enum(String value) {
            this.setValue(value);
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
