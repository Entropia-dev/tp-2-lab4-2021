package ejercicio2;

import java.util.Calendar;

public class ProductoFresco extends Producto {
	private Calendar fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco(Calendar fechaCaducidad, int nroLote, Calendar fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, nroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public Calendar getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(Calendar fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	@Override
	public String toString() {
		return super.toString()+", fecha de envasado: " + Utilidades.calendarToDefaultString(fechaEnvasado) + ", país de origen: " + paisOrigen;
	}
}
