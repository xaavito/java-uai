package com.uai.ejercicio6;


public class Gen {

	private int id;
	
	private int cant;

	private Nucleotido[] nucleotidos;
	
	public Gen(int id, int cant) {
		setId(id);
		setNucleotidos(new Nucleotido[cant]);
		this.setCant(cant);
		pushNucleotidos();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Nucleotido[] getNucleotidos() {
		return nucleotidos;
	}

	public void setNucleotidos(Nucleotido[] nucleotidos) {
		this.nucleotidos = nucleotidos;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	public void pushNucleotidos() {
		for (int i = 0; i < getCant(); i++) {
			nucleotidos[i] = asignar((int)(Math.random()*4));
		}
	}
	
	public Nucleotido asignar(int peso) {
		switch(peso) {
			case 1: {
				return Nucleotido.A;
			}
			case 2: {
				return Nucleotido.C;
			}
			case 3: {
				return Nucleotido.G;
			}
			default: {
				return Nucleotido.T;
			}
		}
	}
	
	public String asString() {
		String vuelta = "";
		for (int i = 0; i < getCant(); i++) {
			vuelta += this.nucleotidos[i];
		}
		return vuelta;
	}
}
