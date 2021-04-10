package ejercicio3;

public class Polideportivo extends Inmueble implements IEdificio, IInstalacionDeportiva {
	
	private double superficie;
	
	private int tipoDeInstalacion;
	
	public Polideportivo(double superficie, int tipoDeInstalacion)
	{
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	@Override
	public String toString()
	{
		return "Superficie: "+superficie+", Tipo de instalacion:"+tipoDeInstalacion;
	}
	
	public int getTipoDeInstalacion()
	{
		return this.tipoDeInstalacion;
	}
	
	public double getSuperficieEdificio()
	{
		return this.superficie;
	}
}
