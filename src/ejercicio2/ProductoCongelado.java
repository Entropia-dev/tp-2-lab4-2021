package ejercicio2;

import java.util.Calendar;

public class ProductoCongelado extends Producto  {
	private double temperaturaRecomendada;

	public ProductoCongelado(Calendar fechaCaducidad, int nroLote, double temperaturaRecomendada) {
		super(fechaCaducidad, nroLote);
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	@Override
	public String toString() {
		return super.toString()+", temperatura recomendada: " + String.format("%,.2f\u00B0", temperaturaRecomendada);
	}
}
