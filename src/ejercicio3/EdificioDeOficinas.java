package ejercicio3;

public class EdificioDeOficinas implements IEdificio {
	private int cantOficinas;
	private double superficieEdificio;
	
	public EdificioDeOficinas(int cantOficinas, double superficieEdificio) {
		this.cantOficinas = cantOficinas;
		this.superficieEdificio = superficieEdificio;
	}

	@Override
	public String toString()
	{
		return "Cantidad de Oficinas: " + cantOficinas+ ", Superficie: " + superficieEdificio;
	}
	
	public int getCantOficinas() {
		return cantOficinas;
	}

	public void setCantOficinas(int cantOficinas) {
		this.cantOficinas = cantOficinas;
	}

	public double getSuperficieEdificio() {
		return superficieEdificio;
	}
}
