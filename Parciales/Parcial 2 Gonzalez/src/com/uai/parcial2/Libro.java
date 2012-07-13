package com.uai.parcial2;

public abstract class Libro implements IProducto{

	private String titulo;
	private String ISBN;
	private float precioBase;
	private int hojas;
	private String editorial;
	private int edicion;
	
	public Libro(String titulo,String ISBN,float precioBase,int hojas,String editorial,int edicion){
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.precioBase = precioBase;
		this.hojas = hojas;
		this.editorial = editorial;
		this.edicion = edicion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	public int getHojas() {
		return hojas;
	}
	public void setHojas(int hojas) {
		this.hojas = hojas;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	public float getDescuentoPorEditorial() {
		float desc = 0f;;
		if (this.getEditorial().equals("EditorialUAI")){
			desc = 0.05f;
		}
		return desc;
	}
	
	public abstract float getDescuento();
	
	public float getPrecio() {
		return getPrecioBase() - (getPrecioBase() * (getDescuento()+getDescuentoPorEditorial()));
	}
	
	public String descripcionAmigable() {
		return getTitulo() + " " + getPrecioBase() + " " + getEditorial() + " " + getISBN();
	}
	
	@Override
	public boolean esAptoPromocionCantidad() {
		return true;
	}
}
