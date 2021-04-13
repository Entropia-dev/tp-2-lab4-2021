package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{

	private String cargo;
	private int antiguedadDocente;
	
	
	public Profesor() 
	{
		this("Sin cargo asignado", 0);
	}
	
	public Profesor(String cargo, int antiguedadDocente, String nombre, int edad)
	{
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente =  antiguedadDocente;
	}
	
	public Profesor(String cargo, int antiguedadDocente)
	{
		super();
		this.cargo = cargo;
		this.antiguedadDocente =  antiguedadDocente;
	}
	
	public String getCargo() 
	{
		return cargo;
	}

	public void setCargo(String cargo) 
	{
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() 
	{
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) 
	{
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() 
	{
		return   "ID: " + super.getId() + ", Nombre: "+super.getNombre()+ ", Edad: "+ super.getEdad()+", Cargo: "+ cargo + ", Antigüedad: "+antiguedadDocente;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Profesor o)
	{
		return o.getId() == super.getId()?0 : (o.getId() < this.getId()?1 : -1);
	}
}
