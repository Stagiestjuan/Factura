package com.jccm.Ferreteria;

public class Factura {

	private String numPieza;
	private String descPieza;
	private int vendidos;
	private double precio;
	private double iva = 20.0;

	public Factura(String numPieza, String descPieza, int vendidos, double precio) {

		this.numPieza = numPieza;
		this.descPieza = descPieza;
		this.vendidos = vendidos;
		this.precio = precio;
	}

	public void fijarnumPieza(String numPieza) {
		this.numPieza = numPieza;

	}

	public String obtenernumPieza() {

		return this.numPieza;
	}

	public void fijardescPieza(String descPieza) {
		this.descPieza = descPieza;
	}

	public String obtenerdescPieza() {
		return this.descPieza;
	}

	public void fijarvendidos(int vendidos) {
		this.vendidos = vendidos;
	}

	public int obtenervendidos() {
		return this.vendidos;
	}

	public void fijarprecio(double precio) {
		this.precio = precio;
	}

	public double obtenerprecio() {
		return this.precio;
	}
	
	public double obtenerTotal() {
		return this.precio * this.vendidos * (1+(this.iva/100));
	}
	
	public String desplegarNotasAdicionales() {
		return "* El valor total de la factura se incluye el iva del " + iva +  "%.";
	}

}