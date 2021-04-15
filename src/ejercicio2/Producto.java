package ejercicio2;

import java.util.Calendar;

public abstract class Producto {
	
	private Calendar fechaCaducidad;
	private int nroLote;
	
	public Producto() {
		nroLote = -1;
		fechaCaducidad = null;
	}

	public Producto(Calendar fechaCaducidad, int nroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.nroLote = nroLote;
	}
	
	public Calendar getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	public void setFechaCaducidad(Calendar fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNroLote() {
		return nroLote;
	}
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}

	@Override
	public String toString() {
		return "Fecha de caducidad: " + Utilidades.calendarToDefaultString(fechaCaducidad) + ", nroLote: " + nroLote;
	}
}
