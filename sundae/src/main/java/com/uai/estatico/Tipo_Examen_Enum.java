package com.uai.estatico;

public enum Tipo_Examen_Enum {
	PARCIAL1(1),
	PARCIAL2(2),
	RECUPERATORIO(3),
	RECUPERATORIO_MATERIA(4),
	FINAL(3);
	
	private int value;

    private Tipo_Examen_Enum(int value) {
            this.setValue(value);
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
