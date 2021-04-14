package ejercicio3;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {
	
	private double superficieEdificio;
	
	private int tipoDeInstalacion;
	
	private String nombre;
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion)
	{
		this.superficieEdificio = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + nombre + ", Superficie: " + superficieEdificio + ", Tipo de instalacion:" + tipoDeInstalacion;
	}

	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
