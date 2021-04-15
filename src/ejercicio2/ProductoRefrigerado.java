package ejercicio2;

import java.util.Calendar;

public class ProductoRefrigerado extends Producto  {

	private String codigoOrganismo;
	
	public ProductoRefrigerado(Calendar fechaCaducidad, int nroLote, String codigoOrganismo) {
		super(fechaCaducidad, nroLote);
		this.codigoOrganismo = codigoOrganismo;
	}

	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", código del organismo de supervisión alimentaria: "+ codigoOrganismo;
	}
	
}
