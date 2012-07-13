package com.uai.parcial2;

public class Kindle implements IProducto{

	private TipoKindle tipo;
	private String color;
	
	public Kindle(TipoKindle tipo) {
		this.setTipo(tipo);
	}

	@Override
	public float getPrecio() {
		return (float)this.getTipo().getPrecio();
	}

	public void setTipo(TipoKindle tipo) {
		this.tipo = tipo;
	}

	public TipoKindle getTipo() {
		return tipo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String descripcionAmigable() {
		return "Kindle " + this.getTipo().toString() + " " + this.getPrecio();
	}

	@Override
	public boolean esAptoPromocionCantidad() {
		return false;
	}
}
